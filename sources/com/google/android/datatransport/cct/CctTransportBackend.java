package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CctTransportBackend implements TransportBackend {
    private final Context applicationContext;
    private final ConnectivityManager connectivityManager;
    private final DataEncoder dataEncoder;
    final URL endPoint;
    private final int readTimeout;
    private final Clock uptimeClock;
    private final Clock wallTimeClock;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class HttpRequest {
        final String apiKey;
        final BatchedLogRequest requestBody;
        final URL url;

        HttpRequest(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.url = url;
            this.requestBody = batchedLogRequest;
            this.apiKey = str;
        }

        HttpRequest withUrl(URL url) {
            return new HttpRequest(url, this.requestBody, this.apiKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class HttpResponse {
        final int code;
        final long nextRequestMillis;
        final URL redirectUrl;

        HttpResponse(int i, URL url, long j) {
            this.code = i;
            this.redirectUrl = url;
            this.nextRequestMillis = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2, int i) {
        this.dataEncoder = BatchedLogRequest.createDataEncoder();
        this.applicationContext = context;
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.endPoint = parseUrlOrThrow(CCTDestination.DEFAULT_END_POINT);
        this.uptimeClock = clock2;
        this.wallTimeClock = clock;
        this.readTimeout = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HttpResponse doSend(HttpRequest httpRequest) {
        Logging.i("CctTransportBackend", "Making request to: %s", httpRequest.url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.readTimeout);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = httpRequest.apiKey;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.dataEncoder.encode(httpRequest.requestBody, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Logging.i("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    Logging.d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Logging.d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new HttpResponse(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream maybeUnGzip = maybeUnGzip(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            HttpResponse httpResponse = new HttpResponse(responseCode, null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(maybeUnGzip))).getNextRequestWaitMillis());
                            if (maybeUnGzip != null) {
                                maybeUnGzip.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return httpResponse;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new HttpResponse(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            Logging.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            Logging.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new HttpResponse(400, null, 0L);
        }
    }

    private static int getNetSubtypeValue(NetworkInfo networkInfo) {
        NetworkConnectionInfo.MobileSubtype mobileSubtype;
        if (networkInfo == null) {
            mobileSubtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            mobileSubtype = NetworkConnectionInfo.MobileSubtype.COMBINED;
        }
        return mobileSubtype.getValue();
    }

    private static int getNetTypeValue(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : networkInfo.getType();
    }

    private static int getPackageVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.e("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    private BatchedLogRequest getRequestBody(BackendRequest backendRequest) {
        LogEvent.Builder protoBuilder;
        HashMap hashMap = new HashMap();
        for (EventInternal eventInternal : backendRequest.getEvents()) {
            String transportName = eventInternal.getTransportName();
            if (hashMap.containsKey(transportName)) {
                ((List) hashMap.get(transportName)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                hashMap.put(transportName, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder clientInfo = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.wallTimeClock.getTime()).setRequestUptimeMs(this.uptimeClock.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(eventInternal2.getInteger("sdk-version"))).setModel(eventInternal2.get("model")).setHardware(eventInternal2.get("hardware")).setDevice(eventInternal2.get("device")).setProduct(eventInternal2.get("product")).setOsBuild(eventInternal2.get("os-uild")).setManufacturer(eventInternal2.get("manufacturer")).setFingerprint(eventInternal2.get("fingerprint")).setCountry(eventInternal2.get("country")).setLocale(eventInternal2.get("locale")).setMccMnc(eventInternal2.get("mcc_mnc")).setApplicationBuild(eventInternal2.get("application_build")).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(Encoding.of("proto"))) {
                    protoBuilder = LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(Encoding.of("json"))) {
                    protoBuilder = LogEvent.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    Logging.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                protoBuilder.setEventTimeMs(eventInternal3.getEventMillis()).setEventUptimeMs(eventInternal3.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal3.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(eventInternal3.getInteger("net-type"))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal3.getInteger("mobile-subtype"))).build());
                if (eventInternal3.getCode() != null) {
                    protoBuilder.setEventCode(eventInternal3.getCode());
                }
                arrayList3.add(protoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        return BatchedLogRequest.create(arrayList2);
    }

    private static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long getTzOffset() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HttpRequest lambda$send$0(HttpRequest httpRequest, HttpResponse httpResponse) {
        URL url = httpResponse.redirectUrl;
        if (url == null) {
            return null;
        }
        Logging.d("CctTransportBackend", "Following redirect to: %s", url);
        return httpRequest.withUrl(httpResponse.redirectUrl);
    }

    private static InputStream maybeUnGzip(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL parseUrlOrThrow(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public EventInternal decorate(EventInternal eventInternal) {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return eventInternal.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT).addMetadata("tz-offset", getTzOffset()).addMetadata("net-type", getNetTypeValue(activeNetworkInfo)).addMetadata("mobile-subtype", getNetSubtypeValue(activeNetworkInfo)).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", getTelephonyManager(this.applicationContext).getSimOperator()).addMetadata("application_build", Integer.toString(getPackageVersionCode(this.applicationContext))).build();
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public BackendResponse send(BackendRequest backendRequest) {
        BatchedLogRequest requestBody = getRequestBody(backendRequest);
        URL url = this.endPoint;
        if (backendRequest.getExtras() != null) {
            try {
                CCTDestination fromByteArray = CCTDestination.fromByteArray(backendRequest.getExtras());
                r3 = fromByteArray.getAPIKey() != null ? fromByteArray.getAPIKey() : null;
                if (fromByteArray.getEndPoint() != null) {
                    url = parseUrlOrThrow(fromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.fatalError();
            }
        }
        try {
            HttpResponse httpResponse = (HttpResponse) Retries.retry(5, new HttpRequest(url, requestBody, r3), new Function() { // from class: com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda0
                @Override // com.google.android.datatransport.runtime.retries.Function
                public final Object apply(Object obj) {
                    CctTransportBackend.HttpResponse doSend;
                    doSend = CctTransportBackend.this.doSend((CctTransportBackend.HttpRequest) obj);
                    return doSend;
                }
            }, new RetryStrategy() { // from class: com.google.android.datatransport.cct.CctTransportBackend$$ExternalSyntheticLambda1
                @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
                public final Object shouldRetry(Object obj, Object obj2) {
                    CctTransportBackend.HttpRequest lambda$send$0;
                    lambda$send$0 = CctTransportBackend.lambda$send$0((CctTransportBackend.HttpRequest) obj, (CctTransportBackend.HttpResponse) obj2);
                    return lambda$send$0;
                }
            });
            int i = httpResponse.code;
            if (i == 200) {
                return BackendResponse.ok(httpResponse.nextRequestMillis);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? BackendResponse.invalidPayload() : BackendResponse.fatalError();
            }
            return BackendResponse.transientError();
        } catch (IOException e) {
            Logging.e("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.transientError();
        }
    }
}
