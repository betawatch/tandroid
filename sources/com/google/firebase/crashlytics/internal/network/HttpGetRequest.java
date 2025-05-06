package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.LiteMode;

/* loaded from: classes3.dex */
public class HttpGetRequest {
    private final Map headers = new HashMap();
    private final Map queryParams;
    private final String url;

    public HttpGetRequest(String str, Map map) {
        this.url = str;
        this.queryParams = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0029, code lost:
    
        if (r1.getValue() != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002b, code lost:
    
        r1 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r7.hasNext() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        r1 = (java.util.Map.Entry) r7.next();
        r0.append("&");
        r0.append((java.lang.String) r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x005b -> B:3:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String createParamsString(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
    }

    private String createUrlWithParams(String str, Map map) {
        String createParamsString = createParamsString(map);
        if (createParamsString.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + createParamsString;
        }
        if (!str.endsWith("&")) {
            createParamsString = "&" + createParamsString;
        }
        return str + createParamsString;
    }

    private String readStream(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public HttpResponse execute() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String readStream = null;
        inputStream = null;
        try {
            String createUrlWithParams = createUrlWithParams(this.url, this.queryParams);
            Logger.getLogger().v("GET Request URL: " + createUrlWithParams);
            httpsURLConnection = (HttpsURLConnection) new URL(createUrlWithParams).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.headers.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        readStream = readStream(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, readStream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest header(String str, String str2) {
        this.headers.put(str, str2);
        return this;
    }
}
