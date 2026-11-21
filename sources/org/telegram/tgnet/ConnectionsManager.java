package org.telegram.tgnet;

import a8.p0;
import ai.b1;
import ai.y0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import bi.c4;
import bi.h0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import hi.r5;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import kg.x1;
import kg.y;
import l2.x;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a3;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.c1;
import org.telegram.messenger.c3;
import org.telegram.messenger.cz;
import org.telegram.messenger.dp;
import org.telegram.messenger.e9;
import org.telegram.messenger.ep;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.go;
import org.telegram.messenger.i5;
import org.telegram.messenger.i7;
import org.telegram.messenger.j10;
import org.telegram.messenger.j2;
import org.telegram.messenger.ks;
import org.telegram.messenger.lj;
import org.telegram.messenger.m4;
import org.telegram.messenger.mj;
import org.telegram.messenger.mp;
import org.telegram.messenger.n6;
import org.telegram.messenger.pk;
import org.telegram.messenger.q10;
import org.telegram.messenger.rj;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.voip.l0;
import org.telegram.messenger.w3;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.de0;
import p4.s0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class ConnectionsManager extends c1 {
    private static final int CORE_POOL_SIZE;
    public static final int CPU_COUNT;
    public static final int ConnectionStateConnected = 3;
    public static final int ConnectionStateConnecting = 1;
    public static final int ConnectionStateConnectingToProxy = 4;
    public static final int ConnectionStateUpdating = 5;
    public static final int ConnectionStateWaitingForNetwork = 2;
    public static final int ConnectionTypeDownload = 2;
    public static final int ConnectionTypeDownload2 = 65538;
    public static final int ConnectionTypeGeneric = 1;
    public static final int ConnectionTypePush = 8;
    public static final int ConnectionTypeUpload = 4;
    public static final int DEFAULT_DATACENTER_ID = Integer.MAX_VALUE;
    public static final Executor DNS_THREAD_POOL_EXECUTOR;
    public static final int DownloadConnectionsCount = 8;
    public static final int FileTypeAudio = 50331648;
    public static final int FileTypeFile = 67108864;
    public static final int FileTypePhoto = 16777216;
    public static final int FileTypeVideo = 33554432;
    private static final ConnectionsManager[] Instance;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final int RequestFlagCanCompress = 4;
    public static final int RequestFlagDoNotWaitFloodWait = 1024;
    public static final int RequestFlagDownloadByteBudget = 262144;
    public static final int RequestFlagEnableUnauthorized = 1;
    public static final int RequestFlagFailOnServerErrors = 2;
    public static final int RequestFlagFailOnServerErrorsExceptFloodWait = 65536;
    public static final int RequestFlagForceDownload = 32;
    public static final int RequestFlagInvokeAfter = 64;
    public static final int RequestFlagListenAfterCancel = 2048;
    public static final int RequestFlagNeedQuickAck = 128;
    public static final int RequestFlagSmallDownload = 131072;
    public static final int RequestFlagTryDifferentDc = 16;
    public static final int RequestFlagWithoutLogin = 8;
    public static final byte USE_IPV4_IPV6_RANDOM = 2;
    public static final byte USE_IPV4_ONLY = 0;
    public static final byte USE_IPV6_ONLY = 1;
    public static final int UploadConnectionsCountPremium = 8;
    private static AsyncTask currentTask;
    private static HashMap<String, ResolvedDomain> dnsCache;
    private static int lastClassGuid;
    private static long lastDnsRequestTime;
    public static long lastPremiumFloodWaitShown;
    private static HashMap<String, ResolveHostByNameTask> resolvingHostnameTasks = new HashMap<>();
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private boolean appPaused;
    private int appResumeCount;
    private int connectionState;
    private boolean forceTryIpV6;
    private boolean isUpdating;
    private long lastPauseTime;
    private AtomicInteger lastRequestToken;
    private final ConcurrentHashMap<Integer, RequestCallbacks> requestCallbacks;

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static class GoogleDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public GoogleDnsLoadTask(int i7) {
            this.currentAccount = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            a8.b("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i7 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i7, nativeByteBuffer.address, j10.i(org.telegram.messenger.c.a(i7).a).d(), this.responseDate);
                return;
            }
            if (s2.a) {
                a8.b("failed to get google result");
                a8.b("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            a8.b("4. currentTask = mozilla");
            AsyncTask unused2 = ConnectionsManager.currentTask = mozillaDnsLoadTask;
        }

        /* JADX WARN: Finally extract failed */
        @Override // android.os.AsyncTask
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            int read;
            boolean z10 = false;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : mp.u1(org.telegram.messenger.c.a(this.currentAccount).a).P3;
                int nextInt = Utilities.b.nextInt(ks.B1) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i7 = 0; i7 < nextInt; i7++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.b.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://dns.google.com/resolve?name=" + str + "&type=ANY&random_padding=" + ((Object) sb2)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                InputStream inputStream2 = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            if (jSONObject.getInt(TeXSymbolParser.TYPE_ATTR) == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new i(0));
                        StringBuilder sb3 = new StringBuilder();
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            sb3.append(((String) arrayList.get(i11)).replace("\"", ""));
                        }
                        byte[] decode = Base64.decode(sb3.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                        nativeByteBuffer.writeBytes(decode);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                            }
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused) {
                        }
                        return nativeByteBuffer;
                    } catch (Throwable th3) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th3;
                        inputStream = inputStream2;
                        try {
                            if (!(th instanceof SocketTimeoutException) && !(th instanceof SSLException)) {
                                z10 = true;
                            }
                            a8.g(th, z10);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    a8.g(th4, true);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } catch (Throwable th5) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th6) {
                                    a8.g(th6, true);
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th5;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th5;
                            } catch (Exception unused3) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th8) {
                th = th8;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new j(this, nativeByteBuffer, 0));
        }
    }

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public interface INativeTlTest {
        boolean test(long j3);
    }

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static class MozillaDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public MozillaDnsLoadTask(int i7) {
            this.currentAccount = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            a8.b("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i7 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i7, nativeByteBuffer.address, j10.i(org.telegram.messenger.c.a(i7).a).d(), this.responseDate);
            } else if (s2.a) {
                a8.b("failed to get mozilla txt result");
            }
        }

        @Override // android.os.AsyncTask
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            int read;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : mp.u1(org.telegram.messenger.c.a(this.currentAccount).a).P3;
                int nextInt = Utilities.b.nextInt(ks.B1) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i7 = 0; i7 < nextInt; i7++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.b.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://mozilla.cloudflare-dns.com/dns-query?name=" + str + "&type=TXT&random_padding=" + ((Object) sb2)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("accept", "application/dns-json");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                InputStream inputStream2 = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[32768];
                    while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        if (jSONObject.getInt(TeXSymbolParser.TYPE_ATTR) == 16) {
                            arrayList.add(jSONObject.getString("data"));
                        }
                    }
                    Collections.sort(arrayList, new i(1));
                    StringBuilder sb3 = new StringBuilder();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        sb3.append(((String) arrayList.get(i11)).replace("\"", ""));
                    }
                    byte[] decode = Base64.decode(sb3.toString(), 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                    nativeByteBuffer.writeBytes(decode);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                        }
                    }
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return nativeByteBuffer;
                } catch (Throwable th4) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th4;
                    inputStream = inputStream2;
                    try {
                        a8.g(th, false);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                a8.g(th5, true);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new j(this, nativeByteBuffer, 1));
        }
    }

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static class RequestCallbacks {
        public Runnable onCancelled;
        public RequestDelegateInternal onComplete;
        public QuickAckDelegate onQuickAck;
        public WriteToSocketDelegate onWriteToSocket;

        public RequestCallbacks(RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
            this.onComplete = requestDelegateInternal;
            this.onQuickAck = quickAckDelegate;
            this.onWriteToSocket = writeToSocketDelegate;
        }
    }

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static class RequestException extends RuntimeException {
        public final int code;
        public final String text;

        public RequestException(TLRPC.TL_error tL_error) {
            super((tL_error == null || (r0 = tL_error.text) == null) ? null : r0);
            String str;
            if (tL_error != null) {
                this.code = tL_error.code;
                this.text = tL_error.text;
            } else {
                this.code = 0;
                this.text = "NULL";
            }
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.text;
        }
    }

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static class ResolveHostByNameTask extends AsyncTask<Void, Void, ResolvedDomain> {
        private ArrayList<Long> addresses = new ArrayList<>();
        private String currentHostName;

        public ResolveHostByNameTask(String str) {
            this.currentHostName = str;
        }

        public void addAddress(long j3) {
            if (this.addresses.contains(Long.valueOf(j3))) {
                return;
            }
            this.addresses.add(Long.valueOf(j3));
        }

        @Override // android.os.AsyncTask
        public ResolvedDomain doInBackground(Void... voidArr) {
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            JSONArray jSONArray;
            int length;
            try {
                URLConnection openConnection = new URL("https://www.google.com/resolve?name=" + this.currentHostName + "&type=A").openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("Host", "dns.google.com");
                openConnection.setConnectTimeout(1000);
                openConnection.setReadTimeout(2000);
                openConnection.connect();
                inputStream = openConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray()));
                        if (!jSONObject.has("Answer") || (length = (jSONArray = jSONObject.getJSONArray("Answer")).length()) <= 0) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                a8.g(th2, false);
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused) {
                            }
                            return null;
                        }
                        ArrayList arrayList = new ArrayList(length);
                        for (int i7 = 0; i7 < length; i7++) {
                            arrayList.add(jSONArray.getJSONObject(i7).getString("data"));
                        }
                        ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            a8.g(th3, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        return resolvedDomain;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            a8.g(th, false);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th5) {
                                    a8.g(th5, false);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            try {
                                InetAddress byName = InetAddress.getByName(this.currentHostName);
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(byName.getHostAddress());
                                return new ResolvedDomain(arrayList2, SystemClock.elapsedRealtime());
                            } catch (Exception e10) {
                                a8.g(e10, false);
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(ResolvedDomain resolvedDomain) {
            int i7 = 0;
            if (resolvedDomain != null) {
                ConnectionsManager.dnsCache.put(this.currentHostName, resolvedDomain);
                int size = this.addresses.size();
                while (i7 < size) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i7).longValue(), resolvedDomain.getAddress());
                    i7++;
                }
            } else {
                int size2 = this.addresses.size();
                while (i7 < size2) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i7).longValue(), "");
                    i7++;
                }
            }
            ConnectionsManager.resolvingHostnameTasks.remove(this.currentHostName);
        }
    }

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static class ResolvedDomain {
        public ArrayList<String> addresses;
        long ttl;

        public ResolvedDomain(ArrayList<String> arrayList, long j3) {
            this.addresses = arrayList;
            this.ttl = j3;
        }

        public String getAddress() {
            ArrayList<String> arrayList = this.addresses;
            return arrayList.get(Utilities.b.nextInt(arrayList.size()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        int i7 = (availableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        sPoolWorkQueue = linkedBlockingQueue;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: org.telegram.tgnet.ConnectionsManager.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "DnsAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = threadFactory;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i7, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsManager(int i7) {
        super(i7);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i10;
        String str7;
        int i11;
        File P0;
        String str8 = "";
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File h = t0.h();
        if (i7 != 0) {
            File file = new File(h, i5.c.i(i7, "account"));
            file.mkdirs();
            h = file;
        }
        String file2 = h.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str4 = gd.R0().toLowerCase();
            str5 = gd.J0().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0);
            String str9 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            boolean z10 = s2.a;
            str2 = str9 + " beta";
            str = "SDK " + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            str2 = "App version unknown";
            str3 = "Android unknown";
            str4 = "en";
            str5 = "";
        }
        String str10 = str4.trim().length() != 0 ? str4 : "en";
        String str11 = str3.trim().length() != 0 ? str3 : "Android unknown";
        String str12 = str2.trim().length() == 0 ? "App version unknown" : str2;
        str = str.trim().length() == 0 ? "SDK Unknown" : str;
        getUserConfig().s();
        String regId = getRegId();
        Typeface typeface = g0.a;
        try {
            byte[] encoded = ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded();
            Pattern pattern = Utilities.a;
            str6 = Utilities.f(Utilities.o(encoded.length, encoded));
        } catch (Throwable unused2) {
            str6 = "";
        }
        int dSTSavings = (TimeZone.getDefault().getDSTSavings() + TimeZone.getDefault().getRawOffset()) / 1000;
        this.forceTryIpV6 = (this.currentAccount == 0 ? t0.b.getSharedPreferences("mainconfig", 0) : f3.e(new StringBuilder("mainconfig"), this.currentAccount, t0.b, 0)).getBoolean("forceTryIpV6", false);
        boolean z11 = getUserConfig().f() != null ? getUserConfig().f().premium : false;
        int d = bz.d();
        String str13 = str10;
        int i12 = s2.d;
        boolean z12 = a8.j;
        if (s2.a) {
            try {
                P0 = g0.P0();
            } catch (Throwable th2) {
                th = th2;
                i10 = d;
            }
            if (P0 != null) {
                a8 j3 = a8.j();
                StringBuilder sb2 = new StringBuilder();
                i10 = d;
                try {
                    str7 = str11;
                    i11 = i12;
                    try {
                        sb2.append(a8.j().c.format(System.currentTimeMillis()));
                        sb2.append("_net.txt");
                        j3.f = new File(P0, sb2.toString());
                        str8 = a8.j().f.getAbsolutePath();
                    } catch (Throwable th3) {
                        th = th3;
                        th.printStackTrace();
                        init(i10, 234, i11, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str7 = str11;
                    i11 = i12;
                    th.printStackTrace();
                    init(i10, 234, i11, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
                }
                init(i10, 234, i11, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
            }
        }
        i10 = d;
        str7 = str11;
        i11 = i12;
        init(i10, 234, i11, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkWebProxyInternal(xi.a aVar, int i7, RequestTimeDelegate requestTimeDelegate) {
        native_checkProxy(this.currentAccount, "127.0.0.1", i7, "", "", aVar.f, requestTimeDelegate);
    }

    public static int generateClassGuid() {
        int i7 = lastClassGuid;
        lastClassGuid = i7 + 1;
        return i7;
    }

    public static void getHostByName(String str, long j3) {
        g0.g3(new c4(str, j3, 19));
    }

    public static int getInitFlags() {
        if (!n6.h(t0.b).f()) {
            return 0;
        }
        if (!s2.a) {
            return 1024;
        }
        a8.b("detected emu");
        return 1024;
    }

    public static ConnectionsManager getInstance(int i7) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i7];
        if (connectionsManager2 != null) {
            return connectionsManager2;
        }
        synchronized (ConnectionsManager.class) {
            try {
                connectionsManager = connectionsManagerArr[i7];
                if (connectionsManager == null) {
                    connectionsManager = new ConnectionsManager(i7);
                    connectionsManagerArr[i7] = connectionsManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return connectionsManager;
    }

    private String getRegId() {
        String str = bz.g;
        if (!TextUtils.isEmpty(str) && bz.f == 13) {
            str = p5.c.k("huawei://", str);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(bz.h)) {
            str = bz.h;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder u10 = p0.u("__", bz.f == 2 ? "FIREBASE" : "HUAWEI", "_GENERATING_SINCE_");
        u10.append(getCurrentTime());
        u10.append("__");
        String sb2 = u10.toString();
        bz.h = sb2;
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelRequest$10(Runnable runnable, int i7, boolean z10) {
        if (runnable != null) {
            listenCancel(i7, new b1(4, runnable));
        }
        native_cancelRequest(this.currentAccount, i7, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.d.c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelRequestsForGuid$11(int i7) {
        native_cancelRequestsForGuid(this.currentAccount, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$discardConnection$0(int i7, int i10) {
        native_discardConnection(this.currentAccount, i7, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$failNotRunningRequest$1(int i7) {
        native_failNotRunningRequest(this.currentAccount, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getHostByName$20(String str, long j3) {
        ResolvedDomain resolvedDomain = dnsCache.get(str);
        if (resolvedDomain != null && SystemClock.elapsedRealtime() - resolvedDomain.ttl < 300000) {
            native_onHostNameResolved(str, j3, resolvedDomain.getAddress());
            return;
        }
        ResolveHostByNameTask resolveHostByNameTask = resolvingHostnameTasks.get(str);
        if (resolveHostByNameTask == null) {
            resolveHostByNameTask = new ResolveHostByNameTask(str);
            try {
                resolveHostByNameTask.executeOnExecutor(DNS_THREAD_POOL_EXECUTOR, null, null, null);
                resolvingHostnameTasks.put(str, resolveHostByNameTask);
            } catch (Throwable th2) {
                a8.g(th2, true);
                native_onHostNameResolved(str, j3, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onCaptchaCheck$28(final int i7, final int i10, final int i11, final String str, String str2) {
        final c3 c3Var = new c3(i7, i10, i11);
        Activity u02 = g0.u0();
        if (u02 != null) {
            Recaptcha.getTasksClient(u02.getApplication(), str2).addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.messenger.z2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    String str3;
                    RecaptchaAction recaptchaAction;
                    RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
                    str3 = str;
                    str3.getClass();
                    switch (str3) {
                        case "SIGNUP":
                        case "signup":
                            recaptchaAction = RecaptchaAction.SIGNUP;
                            break;
                        case "LOGIN":
                        case "login":
                            recaptchaAction = RecaptchaAction.LOGIN;
                            break;
                        default:
                            recaptchaAction = RecaptchaAction.custom(str3);
                            break;
                    }
                    Task<String> executeTask = recaptchaTasksClient.executeTask(recaptchaAction);
                    final int i12 = i7;
                    final int i13 = i10;
                    final int i14 = i11;
                    final c3 c3Var2 = c3Var;
                    executeTask.addOnSuccessListener(new OnSuccessListener() { // from class: org.telegram.messenger.b3
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj2) {
                            String str4;
                            String str5 = (String) obj2;
                            if (s2.a) {
                                if (str5 == null) {
                                    str4 = "null";
                                } else {
                                    str4 = str5.substring(0, Math.min(24, str5.length())) + "...";
                                }
                                StringBuilder n10 = i5.c.n("CaptchaController: got token for account=", i12, ", request=", i13, ", generation=");
                                n10.append(i14);
                                n10.append(", token=");
                                n10.append(str4);
                                n10.append(", length=");
                                i5.c.t(str5 != null ? str5.length() : 0, n10);
                            }
                            c3 c3Var3 = c3Var2;
                            if (str5 == null) {
                                c3.a(c3Var3, "RECAPTCHA_FAILED_TOKEN_NULL");
                            } else {
                                c3.a(c3Var3, str5);
                            }
                        }
                    }).addOnFailureListener(new a3(c3Var2, 1));
                }
            }).addOnFailureListener(new a3(c3Var, 0));
        } else {
            a8.d("CaptchaController: no activity found");
            c3.a(c3Var, "RECAPTCHA_FAILED_NO_ACTIVITY");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onConnectionStateChanged$15(int i7, int i10) {
        getInstance(i7).connectionState = i10;
        ks.f(org.telegram.messenger.c.a(i7).a).k(ks.T1, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIntegrityCheckClassic$25(int i7, long j3, int i10, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder m10 = i5.c.m(i7, "account", ": integrity check gave null token in ");
            m10.append(System.currentTimeMillis() - j3);
            m10.append("ms");
            a8.d(m10.toString());
            native_receivedIntegrityCheckClassic(i7, i10, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        a8.b("account" + i7 + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j3) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i7, i10, str, str2);
        } catch (Exception e10) {
            a8.e("receivedIntegrityCheckClassic failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIntegrityCheckClassic$26(int i7, long j3, int i10, String str, Exception exc) {
        StringBuilder m10 = i5.c.m(i7, "account", ": integrity check failed to give a token in ");
        m10.append(System.currentTimeMillis() - j3);
        m10.append("ms");
        a8.e(m10.toString(), exc);
        native_receivedIntegrityCheckClassic(i7, i10, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + de0.x1(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIntegrityCheckClassic$27(int i7, String str, String str2, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("account");
        sb2.append(i7);
        sb2.append(": server requests integrity classic check with project = ");
        sb2.append(str);
        sb2.append(" nonce = ");
        p5.c.s(str2, sb2);
        try {
            IntegrityManagerFactory.create(t0.b).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new f(i7, currentTimeMillis, str2, i10)).addOnFailureListener(new f(i7, currentTimeMillis, str2, i10));
        } catch (Exception unused) {
            a8.b("account" + i7 + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i7, i10, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onLogout$16(int i7) {
        int i10 = org.telegram.messenger.c.a(i7).a;
        if (j10.i(i10).e() != 0) {
            j10.i(i10).b();
            mp.u1(i10).H3(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onPremiumFloodWait$23(boolean z10, int i7, int i10) {
        boolean z11;
        i7 i7Var = null;
        y8 y8Var = null;
        if (z10) {
            Iterator it = w7.G(i7).h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                y8 y8Var2 = (y8) it.next();
                if (y8Var2 != null && y8Var2.q.contains(Integer.valueOf(i10))) {
                    y8Var = y8Var2;
                    break;
                }
            }
            if (y8Var != null) {
                z11 = !y8Var.T;
                y8Var.T = true;
            }
            z11 = false;
        } else {
            Iterator it2 = w7.G(i7).w.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                i7 i7Var2 = (i7) it2.next();
                if (i7Var2 != null && i7Var2.F0.contains(Integer.valueOf(i10))) {
                    i7Var = i7Var2;
                    break;
                }
            }
            if (i7Var != null) {
                z11 = !i7Var.l;
                i7Var.l = true;
            }
            z11 = false;
        }
        if (z11) {
            ks.f(i7).k(ks.v3, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPremiumFloodWait$24(int i7, boolean z10, int i10) {
        if (j10.t0 != i7) {
            return;
        }
        g0.g3(new b(z10, i7, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onProxyError$19() {
        ks.e().k(ks.M0, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onRequestNewServerIpAndPort$17(int i7, boolean z10, int i10) {
        a8.b("13. currentTask == " + currentTask);
        if (currentTask != null || ((i7 == 0 && Math.abs(lastDnsRequestTime - System.currentTimeMillis()) < 10000) || !z10)) {
            if (s2.a) {
                a8.b("don't start task, current task = " + currentTask + " next task = " + i7 + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + t0.s());
                return;
            }
            return;
        }
        lastDnsRequestTime = System.currentTimeMillis();
        if (i7 == 2) {
            if (s2.a) {
                a8.b("start mozilla txt task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i10);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            a8.b("9. currentTask = mozilla");
            currentTask = mozillaDnsLoadTask;
            return;
        }
        if (s2.a) {
            a8.b("start google txt task");
        }
        GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i10);
        googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
        a8.b("11. currentTask = dnstxt");
        currentTask = googleDnsLoadTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onRequestNewServerIpAndPort$18(int i7, int i10) {
        Utilities.d.c(new b(i7, i10, 2, t0.s()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onSessionCreated$14(int i7) {
        mp.u1(org.telegram.messenger.c.a(i7).a).Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onUnparsedMessageReceived$12(int i7, TLRPC.Updates updates) {
        mp.u1(org.telegram.messenger.c.a(i7).a).V3(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onUpdate$13(int i7) {
        int i10;
        long j3;
        long j10;
        int i11;
        long j11;
        int i12;
        mp u12 = mp.u1(org.telegram.messenger.c.a(i7).a);
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        u12.I(false);
        ArrayList arrayList = u12.U1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = u12.S1;
        int size = arrayList2.size();
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= size) {
                break;
            }
            ep epVar = (ep) arrayList2.get(i14);
            if (epVar.f <= elapsedRealtime) {
                u12.R(epVar);
                arrayList2.remove(i14);
                u12.T1.l(epVar.a);
                i14--;
                size--;
            }
            i14++;
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            ep epVar2 = (ep) arrayList.get(i15);
            if (epVar2.f <= elapsedRealtime) {
                u12.R(epVar2);
                arrayList.remove(i15);
                u12.V1.remove(epVar2.a + "_" + epVar2.b);
                i15 += -1;
                size2 += -1;
            }
            i15++;
        }
        long j12 = 1000;
        long j13 = 0;
        if (u12.getUserConfig().p()) {
            if (u12.j7 || u12.getConnectionsManager().getPauseTime() != 0 || !t0.w || t0.F) {
                if (u12.O2 != 2 && !u12.P2 && Math.abs(System.currentTimeMillis() - u12.getConnectionsManager().getPauseTime()) >= 2000) {
                    u12.O2 = 2;
                    if (u12.N2 != 0) {
                        u12.getConnectionsManager().cancelRequest(u12.N2, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = true;
                    u12.N2 = u12.getConnectionsManager().sendRequest(updatestatus, new mj(u12, 10));
                }
            } else if (t0.H != 0 && Math.abs(t0.H - System.currentTimeMillis()) > 1000 && u12.O2 != 1 && (u12.M2 == 0 || Math.abs(System.currentTimeMillis() - u12.M2) >= 55000 || u12.P2)) {
                u12.O2 = 1;
                if (u12.N2 != 0) {
                    u12.getConnectionsManager().cancelRequest(u12.N2, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = false;
                u12.N2 = u12.getConnectionsManager().sendRequest(updatestatus2, new mj(u12, 9));
            }
            if (u12.X0.m() != 0) {
                for (int i16 = 0; i16 < u12.X0.m(); i16++) {
                    long j14 = u12.X0.j(i16);
                    if (Math.abs(currentTimeMillis - u12.Y0.valueAt(i16)) >= 1500) {
                        if (s2.a) {
                            a8.b("QUEUE CHANNEL " + j14 + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        }
                        u12.M3(0, j14);
                    }
                }
            }
            for (int i17 = 0; i17 < 3; i17++) {
                if (u12.b2(i17) != 0 && Math.abs(currentTimeMillis - u12.b2(i17)) >= 1500) {
                    if (s2.a) {
                        a8.b(i17 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    u12.W3(i17, 0);
                }
            }
        }
        int currentTime = u12.getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - u12.N0) >= 5000) {
            u12.N0 = System.currentTimeMillis();
            if (u12.K0.m() != 0) {
                int i18 = 0;
                while (i18 < u12.K0.m()) {
                    long j15 = u12.K0.j(i18);
                    TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = u12.l1(j15);
                    tL_messages_getMessagesViews.id = (ArrayList) u12.K0.n(i18);
                    tL_messages_getMessagesViews.increment = i18 == 0;
                    u12.getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new go(u12, j15, tL_messages_getMessagesViews, 3));
                    i18++;
                    j12 = j12;
                }
                j3 = j12;
                u12.K0.b();
            } else {
                j3 = 1000;
            }
            if (u12.M0 > 0) {
                g0.g3(new pk(u12, currentTime, 3));
            }
        } else {
            j3 = 1000;
        }
        if (!u12.a0.isEmpty()) {
            ArrayList arrayList3 = null;
            for (Map.Entry entry : u12.a0.entrySet()) {
                if (((Integer) entry.getValue()).intValue() < currentTime - 30) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add((Long) entry.getKey());
                }
            }
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj = arrayList3.get(i19);
                    i19++;
                    u12.a0.remove((Long) obj);
                }
                g0.g3(new rj(u12, 17));
            }
        }
        if (u12.A0.size() != 0) {
            int i20 = 0;
            while (i20 < u12.A0.size()) {
                long keyAt = u12.A0.keyAt(i20);
                if (u12.A0.valueAt(i20) < System.currentTimeMillis() / j3) {
                    u12.A0.delete(keyAt);
                    i20--;
                    if (u12.B0.h(keyAt) >= 0) {
                        u12.K0(keyAt);
                    }
                }
                i20++;
            }
        }
        if (u12.C0.size() != 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() / j3;
            int i21 = 0;
            while (i21 < u12.C0.size()) {
                long keyAt2 = u12.C0.keyAt(i21);
                if (u12.C0.valueAt(i21) < elapsedRealtime2) {
                    if (u12.B0.h(keyAt2) >= 0) {
                        u12.C0.put(keyAt2, (int) (300 + elapsedRealtime2));
                    } else {
                        u12.C0.delete(keyAt2);
                        i21--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = u12.l1(-keyAt2);
                    u12.getConnectionsManager().sendRequest(tL_messages_getOnlines, new lj(u12, keyAt2, 12));
                }
                i21++;
            }
        }
        if (u12.W.isEmpty() && u12.c0 == u12.W.size()) {
            j10 = currentTimeMillis;
            i11 = 1;
            j11 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList(u12.W.keySet());
            int i22 = 0;
            int i23 = 0;
            while (i22 < arrayList4.size()) {
                Long l10 = (Long) arrayList4.get(i22);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) u12.W.get(l10);
                if (concurrentHashMap != null) {
                    ArrayList arrayList5 = new ArrayList(concurrentHashMap.keySet());
                    int i24 = i13;
                    while (i24 < arrayList5.size()) {
                        Integer num = (Integer) arrayList5.get(i24);
                        ArrayList arrayList6 = (ArrayList) concurrentHashMap.get(num);
                        long j16 = j13;
                        if (arrayList6 != null) {
                            int i25 = i13;
                            while (i25 < arrayList6.size()) {
                                dp dpVar = (dp) arrayList6.get(i25);
                                int i26 = i10;
                                int i27 = i24;
                                long j17 = currentTimeMillis;
                                if (dpVar.a + (dpVar.c instanceof TLRPC.TL_sendMessageGamePlayAction ? 30000 : 5900) < j17) {
                                    arrayList6.remove(dpVar);
                                    i25--;
                                    i23 = i26;
                                }
                                i25++;
                                i10 = i26;
                                i24 = i27;
                                currentTimeMillis = j17;
                            }
                        }
                        long j18 = currentTimeMillis;
                        int i28 = i10;
                        int i29 = i24;
                        if (arrayList6 == null || arrayList6.isEmpty()) {
                            concurrentHashMap.remove(num);
                            arrayList5.remove(i29);
                            i12 = i29 - 1;
                        } else {
                            i12 = i29;
                        }
                        i24 = i12 + 1;
                        j13 = j16;
                        i10 = i28;
                        currentTimeMillis = j18;
                        i13 = 0;
                    }
                }
                long j19 = currentTimeMillis;
                int i30 = i10;
                long j20 = j13;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    u12.W.remove(l10);
                    arrayList4.remove(i22);
                    i22--;
                }
                i22++;
                j13 = j20;
                i10 = i30;
                currentTimeMillis = j19;
                i13 = 0;
            }
            j10 = currentTimeMillis;
            i11 = i10;
            j11 = j13;
            u12.z5();
            if (i23 != 0) {
                g0.g3(new rj(u12, 18));
            }
        }
        if (m6.o == i11 && Math.abs(j10 - mp.G8) >= 60) {
            g0.g3(u12.K2);
            mp.G8 = j10;
        }
        if (u12.getUserConfig().k0 != null && Math.abs(j10 - mp.H8) >= 60) {
            g0.g3(u12.L2);
            mp.H8 = j10;
        }
        if (u12.n2 != j11 && Math.abs(SystemClock.elapsedRealtime() - u12.n2) >= 10800000) {
            PushListenerController.sendRegistrationToServer(bz.f, bz.g);
        }
        u12.getLocationController().t();
        u12.N(false);
        if (u12.I2 > u12.getConnectionsManager().getCurrentTime() || u12.H2 || !u12.getUserConfig().p()) {
            return;
        }
        u12.H2 = true;
        u12.getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new mj(u12, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onUpdateConfig$21(int i7, TLRPC.TL_config tL_config) {
        g0.g3(new w3(8, mp.u1(org.telegram.messenger.c.a(i7).a), tL_config));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j3);
        } else if (tLObject instanceof TLRPC.Updates) {
            CountDownLatch countDownLatch = KeepAliveJob.a;
            Utilities.e.c(new j2(3));
            mp.u1(org.telegram.messenger.c.a(this.currentAccount).a).V3((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7 A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:4:0x0012, B:27:0x007f, B:10:0x00a3, B:12:0x00a7, B:13:0x00ab, B:15:0x00af, B:17:0x00b9, B:18:0x00c8, B:20:0x00de, B:35:0x002b, B:39:0x0037, B:43:0x0048, B:6:0x0025), top: B:2:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:4:0x0012, B:27:0x007f, B:10:0x00a3, B:12:0x00a7, B:13:0x00ab, B:15:0x00af, B:17:0x00b9, B:18:0x00c8, B:20:0x00de, B:35:0x002b, B:39:0x0037, B:43:0x0048, B:6:0x0025), top: B:2:0x0010, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$sendRequestInternal$8(TLObject tLObject, int i7, long j3, RequestDelegate requestDelegate, RequestDelegateTimestamp requestDelegateTimestamp, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, boolean z10, int i12, long j10, int i13, String str, int i14, long j11, long j12, int i15) {
        int i16;
        TLObject tLObject2;
        ConnectionsManager connectionsManager;
        String str2;
        TLRPC.TL_error tL_error = null;
        try {
            if (j10 != 0) {
                NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
                wrap.setDataSourceType(TLDataSourceType.NETWORK);
                wrap.reused = true;
                i16 = wrap.limit();
                try {
                    tLObject2 = tLObject.deserializeResponse(wrap, wrap.readInt32(true), true);
                } catch (Exception e10) {
                    boolean z11 = s2.a;
                    a8.i(e10, true);
                    return;
                }
            } else if (str != null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.code = i13;
                tL_error2.text = str;
                if (s2.a && i13 != -2000) {
                    a8.d(tLObject + " got error " + tL_error2.code + " " + tL_error2.text);
                }
                i16 = 0;
                tLObject2 = null;
                tL_error = tL_error2;
            } else {
                i16 = 0;
                tLObject2 = null;
            }
            if ((i7 & 2) != 0) {
                try {
                    if (i61.l0.isEmpty()) {
                        connectionsManager = this;
                        b3.g.c(t0.b).e(i16, Math.max(0L, (System.currentTimeMillis() - j3) - native_getCurrentPingTime(connectionsManager.currentAccount)));
                        boolean z12 = s2.a;
                        if (tLObject2 != null) {
                            tLObject2.networkType = i14;
                        }
                        if (s2.a) {
                            StringBuilder sb2 = new StringBuilder("java received ");
                            sb2.append(tLObject2);
                            if (tL_error != null) {
                                str2 = " error = " + tL_error;
                            } else {
                                str2 = "";
                            }
                            sb2.append(str2);
                            sb2.append(" messageId = 0x");
                            sb2.append(Long.toHexString(j12));
                            a8.b(sb2.toString());
                        }
                        Utilities.d.c(new di.a3(connectionsManager, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j11));
                    }
                } catch (Exception e11) {
                    e = e11;
                    a8.g(e, true);
                }
            }
            connectionsManager = this;
            boolean z122 = s2.a;
            if (tLObject2 != null) {
            }
            if (s2.a) {
            }
            Utilities.d.c(new di.a3(connectionsManager, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j11));
        } catch (Exception e12) {
            e = e12;
            a8.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRequestTyped$3(Executor executor, q10 q10Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new ii.a(q10Var, tLObject, tL_error, 1));
        } else {
            q10Var.a(tLObject, tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, q10 q10Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().V3(updates, false);
        }
        if (executor != null) {
            executor.execute(new y(q10Var, updates, tL_error, 22));
        } else {
            q10Var.a(updates, tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setIsUpdating$22(boolean z10) {
        if (this.isUpdating == z10) {
            return;
        }
        this.isUpdating = z10;
        if (this.connectionState == 3) {
            ks.f(org.telegram.messenger.c.a(this.currentAccount).a).k(ks.T1, new Object[0]);
        }
    }

    private void listen(int i7, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i7), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i7, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i7));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static native byte[] nativeTestGenerateClientHello(String str);

    public static native void native_applyDatacenterAddress(int i7, int i10, String str, int i11);

    public static native void native_applyDnsConfig(int i7, long j3, String str, int i10);

    public static native void native_bindRequestToGuid(int i7, int i10, int i11);

    public static native void native_cancelRequest(int i7, int i10, boolean z10);

    public static native void native_cancelRequestsForGuid(int i7, int i10);

    public static native long native_checkProxy(int i7, String str, int i10, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate);

    public static native void native_cleanUp(int i7, boolean z10);

    public static native void native_discardConnection(int i7, int i10, int i11);

    public static native void native_failNotRunningRequest(int i7, int i10);

    public static native int native_getConnectionState(int i7);

    public static native long native_getCurrentAuthKeyId(int i7);

    public static native int native_getCurrentDatacenterId(int i7);

    public static native int native_getCurrentPingTime(int i7);

    public static native int native_getCurrentTime(int i7);

    public static native long native_getCurrentTimeMillis(int i7);

    public static native int native_getTimeDifference(int i7);

    public static native void native_init(int i7, int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, long j3, boolean z10, boolean z11, boolean z12, int i14, int i15);

    public static native boolean native_isGoodPrime(byte[] bArr, int i7);

    public static native int native_isTestBackend(int i7);

    public static native void native_moveDatacenter(int i7, int i10);

    public static native void native_onHostNameResolved(String str, long j3, String str2);

    public static native void native_pauseNetwork(int i7);

    public static native void native_receivedCaptchaResult(int i7, int i10, int i11, String str);

    public static native void native_receivedIntegrityCheckClassic(int i7, int i10, String str, String str2);

    public static native void native_resumeNetwork(int i7, boolean z10);

    public static native void native_sendRequest(int i7, long j3, int i10, int i11, int i12, boolean z10, int i13, int i14);

    public static native void native_setIpStrategy(int i7, byte b10);

    public static native void native_setJava(boolean z10);

    public static native void native_setLangCode(int i7, String str);

    public static native void native_setNetworkAvailable(int i7, boolean z10, int i10, boolean z11);

    public static native void native_setProxySettings(int i7, String str, int i10, String str2, String str3, String str4);

    public static native void native_setPushConnectionEnabled(int i7, boolean z10);

    public static native void native_setRegId(int i7, String str);

    public static native void native_setSystemLangCode(int i7, String str);

    public static native void native_setUserId(int i7, long j3);

    public static native void native_switchBackend(int i7, boolean z10);

    public static native boolean native_test_AuthAuthorization(long j3);

    public static native void native_updateDcSettings(int i7);

    public static void onBytesReceived(int i7, int i10, int i11) {
        try {
            cz.e(i11).h(i10, 6, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void onBytesSent(int i7, int i10, int i11) {
        try {
            cz.e(org.telegram.messenger.c.a(i11).a).j(i10, 6, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void onCaptchaCheck(int i7, int i10, int i11, String str, String str2) {
        g0.g3(new r5(i7, i10, i11, str, str2, 2));
    }

    public static void onConnectionStateChanged(int i7, int i10) {
        g0.g3(new e9(i10, i7, 4));
    }

    public static void onIntegrityCheckClassic(int i7, int i10, String str, String str2) {
        g0.g3(new x(i7, i10, str, str2));
    }

    public static void onInternalPushReceived(int i7) {
        CountDownLatch countDownLatch = KeepAliveJob.a;
        Utilities.e.c(new j2(4));
    }

    public static void onLogout(int i7) {
        g0.g3(new jg.x(i7, 10));
    }

    public static void onPremiumFloodWait(int i7, int i10, boolean z10) {
        g0.g3(new b(i7, i10, 0, z10));
    }

    public static void onProxyError() {
        g0.g3(new d());
    }

    public static void onRequestClear(int i7, int i10, boolean z10) {
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10));
        if (!z10) {
            if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
            }
        } else if (requestCallbacks != null) {
            Runnable runnable = requestCallbacks.onCancelled;
            if (runnable != null) {
                runnable.run();
            }
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
        }
    }

    public static void onRequestComplete(int i7, int i10, long j3, int i11, String str, int i12, long j10, long j11, int i13) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10));
        connectionsManager.requestCallbacks.remove(Integer.valueOf(i10));
        if (requestCallbacks == null || (requestDelegateInternal = requestCallbacks.onComplete) == null) {
            return;
        }
        requestDelegateInternal.run(j3, i11, str, i12, j10, j11, i13);
    }

    public static void onRequestNewServerIpAndPort(int i7, int i10) {
        Utilities.e.c(new e9(i7, i10, 5));
    }

    public static void onRequestQuickAck(int i7, int i10) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10))) == null || (quickAckDelegate = requestCallbacks.onQuickAck) == null) {
            return;
        }
        quickAckDelegate.run();
    }

    public static void onRequestWriteToSocket(int i7, int i10) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i7);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i10))) == null || (writeToSocketDelegate = requestCallbacks.onWriteToSocket) == null) {
            return;
        }
        writeToSocketDelegate.run();
    }

    public static void onSessionCreated(int i7) {
        Utilities.d.c(new jg.x(i7, 9));
    }

    public static void onUnparsedMessageReceived(long j3, int i7, long j10) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j3);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLRPC.Updates TLdeserialize = TLRPC.Updates.TLdeserialize(wrap, readInt32, true);
            boolean z10 = a8.j;
            boolean z11 = s2.a;
            int i10 = 0;
            if (TLdeserialize == null) {
                if (s2.a) {
                    a8.b(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
                    return;
                }
                return;
            }
            if (s2.a) {
                a8.b("java received " + TLdeserialize);
            }
            CountDownLatch countDownLatch = KeepAliveJob.a;
            Utilities.e.c(new j2(3));
            Utilities.d.c(new g(i7, TLdeserialize, i10));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void onUpdate(int i7) {
        Utilities.d.c(new jg.x(i7, 8));
    }

    public static void onUpdateConfig(long j3, int i7) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j3);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.d.c(new y0(i7, TLdeserialize, 20));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendRequestInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i7, final int i10, final int i11, final boolean z10, final int i12) {
        int i13;
        if (s2.a) {
            a8.b("send request " + tLObject + " with token = " + i12);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            final long currentTimeMillis = (i11 & 2) != 0 ? System.currentTimeMillis() : 0L;
            listen(i12, new RequestDelegateInternal() { // from class: org.telegram.tgnet.c
                @Override // org.telegram.tgnet.RequestDelegateInternal
                public final void run(long j3, int i14, String str, int i15, long j10, long j11, int i16) {
                    ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i11, currentTimeMillis, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i7, i10, z10, i12, j3, i14, str, i15, j10, j11, i16);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            if ((i7 & 262144) != 0 && (i11 & 65535) == 2) {
                if (tLObject instanceof TLRPC.TL_upload_getFile) {
                    i13 = ((TLRPC.TL_upload_getFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getWebFile) {
                    i13 = ((TLRPC.TL_upload_getWebFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getCdnFile) {
                    i13 = ((TLRPC.TL_upload_getCdnFile) tLObject).limit;
                }
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i7, i10, i11, z10, i12, i13);
            }
            i13 = 0;
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i7, i10, i11, z10, i12, i13);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i7 = 0; i7 < 4; i7++) {
            native_setLangCode(i7, lowerCase);
        }
    }

    public static void setProxySettings(boolean z10, xi.a aVar) {
        String str;
        String str2;
        String str3;
        int i7;
        String str4;
        int i10;
        String str5 = "";
        if (z10 && aVar != null && aVar.g()) {
            String str6 = aVar.b;
            int i11 = aVar.c;
            String str7 = aVar.d;
            String str8 = aVar.e;
            String str9 = aVar.f;
            if (aVar.a == 3) {
                i7 = xi.i.o(str6, str9);
                if (i7 == 0) {
                    i7 = 9;
                }
                str2 = "";
                str3 = str9;
                str5 = "127.0.0.1";
                str = str2;
            } else {
                synchronized (xi.i.y) {
                    try {
                        xi.i iVar = xi.i.z;
                        if (iVar != null) {
                            iVar.q();
                            xi.i.z = null;
                        }
                    } finally {
                    }
                }
                str5 = str6;
                i7 = i11;
                str = str7;
                str2 = str8;
                str3 = str9;
            }
        } else {
            xi.i.p();
            str = "";
            str2 = str;
            str3 = str2;
            i7 = 0;
        }
        int i12 = 0;
        while (i12 < 4) {
            if (z10 && aVar != null && aVar.g()) {
                str4 = str5;
                i10 = i12;
                native_setProxySettings(i10, str4, i7, str, str2, str3);
            } else {
                str4 = str5;
                i10 = i12;
                native_setProxySettings(i10, "", 1080, "", "", "");
            }
            int i13 = org.telegram.messenger.c.a(i10).a;
            if (j10.i(i13).p()) {
                Utilities.d.c(new rj(mp.u1(i13), 28));
            }
            i12 = i10 + 1;
            str5 = str4;
        }
    }

    public static void setRegId(String str, int i7, String str2) {
        if (!TextUtils.isEmpty(str) && i7 == 13) {
            str = p5.c.k("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            StringBuilder u10 = p0.u("__", i7 == 2 ? "FIREBASE" : "HUAWEI", "_GENERATING_SINCE_");
            u10.append(getInstance(0).getCurrentTime());
            u10.append("__");
            str2 = u10.toString();
            bz.h = str2;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            native_setRegId(i10, str2);
        }
    }

    public static void setSystemLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i7 = 0; i7 < 4; i7++) {
            native_setSystemLangCode(i7, lowerCase);
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public void applyDatacenterAddress(int i7, String str, int i10) {
        native_applyDatacenterAddress(this.currentAccount, i7, str, i10);
    }

    public void bindRequestToGuid(int i7, int i10) {
        if (i10 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i7, i10);
    }

    public void cancelRequest(int i7, boolean z10) {
        cancelRequest(i7, z10, null);
    }

    public void cancelRequestsForGuid(int i7) {
        Utilities.d.c(new a(this, i7, 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (s2.a) {
            a8.b("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, t0.s(), t0.f(), t0.p());
    }

    public long checkProxy(xi.a aVar, RequestTimeDelegate requestTimeDelegate) {
        if (aVar != null && aVar.g()) {
            if (aVar.a != 3) {
                return native_checkProxy(this.currentAccount, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, requestTimeDelegate);
            }
            xi.e eVar = xi.e.e;
            if (eVar == null) {
                synchronized (xi.e.class) {
                    try {
                        eVar = xi.e.e;
                        if (eVar == null) {
                            eVar = new xi.e(0);
                            xi.e.e = eVar;
                        }
                    } finally {
                    }
                }
            }
            xi.e eVar2 = eVar;
            x1 x1Var = new x1(this, 28);
            if (aVar.a == 3 && aVar.g() && requestTimeDelegate != null) {
                g0.g3(new s0(eVar2, x1Var, aVar, requestTimeDelegate, 7));
                return 0L;
            }
            if (requestTimeDelegate != null) {
                requestTimeDelegate.run(-1L);
                return 0L;
            }
        }
        return 0L;
    }

    public void cleanup(boolean z10) {
        native_cleanUp(this.currentAccount, z10);
    }

    public void discardConnection(int i7, int i10) {
        Utilities.d.c(new jg.q(this, i7, i10, 8));
    }

    public void failNotRunningRequest(int i7) {
        Utilities.d.c(new a(this, i7, 0));
    }

    public int getConnectionState() {
        int i7 = this.connectionState;
        if (i7 == 3 && this.isUpdating) {
            return 5;
        }
        return i7;
    }

    public long getCurrentAuthKeyId() {
        return native_getCurrentAuthKeyId(this.currentAccount);
    }

    public int getCurrentDatacenterId() {
        return native_getCurrentDatacenterId(this.currentAccount);
    }

    public int getCurrentTime() {
        return native_getCurrentTime(this.currentAccount);
    }

    public long getCurrentTimeMillis() {
        return native_getCurrentTimeMillis(this.currentAccount);
    }

    public byte getIpStrategy() {
        if (s2.a) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (s2.a) {
                            a8.b("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i7 = 0; i7 < interfaceAddresses.size(); i7++) {
                            InetAddress address = interfaceAddresses.get(i7).getAddress();
                            if (s2.a) {
                                a8.b("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && s2.a) {
                                a8.b("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (networkInterfaces2.hasMoreElements()) {
                NetworkInterface nextElement2 = networkInterfaces2.nextElement();
                if (nextElement2.isUp() && !nextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = nextElement2.getInterfaceAddresses();
                    for (int i10 = 0; i10 < interfaceAddresses2.size(); i10++) {
                        InetAddress address2 = interfaceAddresses2.get(i10).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z10 = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (address2.getHostAddress().startsWith("192.0.0.")) {
                                    z11 = true;
                                } else {
                                    z12 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z10) {
                if (!this.forceTryIpV6) {
                    if (z11) {
                        return (byte) 2;
                    }
                    if (!z12) {
                    }
                }
                return (byte) 1;
            }
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
        return (byte) 0;
    }

    public long getPauseTime() {
        return this.lastPauseTime;
    }

    public int getTimeDifference() {
        return native_getTimeDifference(this.currentAccount);
    }

    public void init(int i7, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, long j3, boolean z10, boolean z11) {
        String str10;
        String str11;
        Context context;
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
        xi.a c10 = xi.a.c(sharedPreferences);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && c10.g()) {
            if (c10.a == 3) {
                int o4 = xi.i.o(c10.b, c10.f);
                int i13 = this.currentAccount;
                if (o4 == 0) {
                    o4 = 9;
                }
                native_setProxySettings(i13, "127.0.0.1", o4, "", "", c10.f);
            } else {
                native_setProxySettings(this.currentAccount, c10.b, c10.c, c10.d, c10.e, c10.f);
            }
        }
        try {
            context = t0.b;
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
            if (installSourceInfo != null) {
                str10 = installSourceInfo.getInitiatingPackageName();
                if (str10 == null) {
                    try {
                        str10 = installSourceInfo.getInstallingPackageName();
                    } catch (Throwable unused2) {
                    }
                }
            }
            str10 = "";
        } else {
            str10 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        }
        String str12 = str10 == null ? "" : str10;
        try {
            str11 = t0.b.getPackageName();
        } catch (Throwable unused3) {
            str11 = "";
        }
        native_init(this.currentAccount, i7, i10, i11, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i12, j3, z10, z11, t0.s(), t0.f(), bz.v());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences h12 = mp.h1();
        return h12.contains("pushConnection") ? h12.getBoolean("pushConnection", true) : mp.u1(j10.t0).h7.getBoolean("backgroundConnection", false);
    }

    public boolean isTestBackend() {
        return native_isTestBackend(this.currentAccount) != 0;
    }

    public void resumeNetworkMaybe() {
        native_resumeNetwork(this.currentAccount, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate) {
        return sendRequest(tLObject, requestDelegate, (QuickAckDelegate) null, 0);
    }

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i7, int i10, int i11, boolean z10) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i7, i10, i11, z10, andIncrement);
        return andIncrement;
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, q10 q10Var) {
        return sendRequestTyped(tLMethod, null, q10Var);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, q10 q10Var) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, q10Var, DEFAULT_DATACENTER_ID, 0);
    }

    public void setAppPaused(boolean z10, boolean z11) {
        if (!z11) {
            this.appPaused = z10;
            if (s2.a) {
                a8.b("app paused = " + z10);
            }
            if (z10) {
                this.appResumeCount--;
            } else {
                this.appResumeCount++;
            }
            if (s2.a) {
                i5.c.t(this.appResumeCount, new StringBuilder("app resume count "));
            }
            if (this.appResumeCount < 0) {
                this.appResumeCount = 0;
            }
        }
        if (this.appResumeCount == 0) {
            if (this.lastPauseTime == 0) {
                this.lastPauseTime = System.currentTimeMillis();
            }
            native_pauseNetwork(this.currentAccount);
        } else {
            if (this.appPaused) {
                return;
            }
            if (s2.a) {
                a8.b("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                i5 contactsController = getContactsController();
                contactsController.getClass();
                Utilities.e.c(new m4(contactsController, 3));
            }
            this.lastPauseTime = 0L;
            native_resumeNetwork(this.currentAccount, false);
        }
    }

    public void setDefaultDatacenterId(int i7) {
        native_moveDatacenter(this.currentAccount, i7);
    }

    public void setForceTryIpV6(boolean z10) {
        if (this.forceTryIpV6 != z10) {
            this.forceTryIpV6 = z10;
            checkConnection();
        }
    }

    public void setIsUpdating(boolean z10) {
        g0.g3(new ch.k(17, this, z10));
    }

    public void setPushConnectionEnabled(boolean z10) {
        native_setPushConnectionEnabled(this.currentAccount, z10);
    }

    public void setUserId(long j3) {
        native_setUserId(this.currentAccount, j3);
    }

    public void switchBackend(boolean z10) {
        mp.g1().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z10);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public void cancelRequest(int i7, boolean z10, Runnable runnable) {
        Utilities.d.c(new l0(i7, 1, this, runnable, z10));
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i7) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i7, DEFAULT_DATACENTER_ID, 1, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, q10 q10Var) {
        return sendRequestTyped(tLMethod, executor, q10Var, DEFAULT_DATACENTER_ID, 0);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, q10 q10Var, int i7, int i10) {
        return sendRequestTyped(tLMethod, null, new h0(this, executor, q10Var, 5), i7, i10);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i7, int i10) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i7, DEFAULT_DATACENTER_ID, i10, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, q10 q10Var, int i7) {
        return sendRequestTyped(tLMethod, executor, q10Var, DEFAULT_DATACENTER_ID, i7);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i7, int i10, int i11) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i7, i11, i10, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final q10 q10Var, int i7, int i10) {
        return sendRequest(tLMethod, new RequestDelegate() { // from class: org.telegram.tgnet.h
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, q10Var, tLObject, tL_error);
            }
        }, null, null, null, i10, i7, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, int i7) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, null, i7, DEFAULT_DATACENTER_ID, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i7, int i10, int i11, boolean z10) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i7, i10, i11, z10);
    }

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i7, final int i10, final int i11, final boolean z10) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.d.c(new Runnable() { // from class: org.telegram.tgnet.e
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsManager.this.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i7, i10, i11, z10, andIncrement);
            }
        });
        return andIncrement;
    }
}
