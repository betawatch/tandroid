package oi;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k2.v;
import ki.c0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.g10;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class k implements f10 {
    public static final Object v = new Object();
    public static k w;
    public static k x;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ServerSocket i;
    public WebView o;
    public b5.h p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public d u;
    public final Object a = new Object();
    public final ExecutorService j = Executors.newCachedThreadPool();
    public final ExecutorService k = Executors.newSingleThreadExecutor();
    public final AtomicInteger l = new AtomicInteger(1);
    public final HashMap m = new HashMap();
    public final ArrayDeque n = new ArrayDeque();

    public k(lf.i iVar, String str, byte[] bArr) {
        this.b = (String) iVar.d;
        String str2 = (String) iVar.b;
        this.c = str2;
        String str3 = (String) iVar.c;
        String p5 = str3.isEmpty() ? "/" : a4.a.p("/", str3, "/");
        this.d = p5;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        String concat2 = str3.isEmpty() ? "tdesktop-web-proxy-bridge-v1\n".concat(str2) : e2.j("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        this.g = concat + p5 + "?bridge=" + Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11) + "#android=" + encodeToString;
        this.i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.a) {
            try {
                if (!kVar.r && kVar.o == null) {
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null && g10Var.isBackground()) {
                        kVar.s = true;
                        return;
                    }
                    kVar.s = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.o = webView;
                        webView.setBackgroundColor(0);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(false);
                        settings.setDatabaseEnabled(false);
                        settings.setAllowFileAccess(false);
                        settings.setAllowContentAccess(false);
                        settings.setCacheMode(2);
                        settings.setJavaScriptCanOpenWindowsAutomatically(false);
                        settings.setSupportMultipleWindows(false);
                        settings.setGeolocationEnabled(false);
                        settings.setMediaPlaybackRequiresUserGesture(true);
                        settings.setMixedContentMode(1);
                        if (Build.VERSION.SDK_INT >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new i(kVar, 0));
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVar.f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new v(kVar, 8));
                        webView.loadUrl(kVar.g);
                    } catch (Exception e) {
                        FileLog.e(e);
                        kVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(k kVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = kVar.i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.a) {
                    try {
                        if (!kVar.r && kVar.m.size() < 64) {
                            while (true) {
                                andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.l, new h());
                                if (andUpdate != 0 && !kVar.m.containsKey(Integer.valueOf(andUpdate))) {
                                    break;
                                }
                            }
                            j jVar = new j(andUpdate, accept);
                            kVar.m.put(Integer.valueOf(andUpdate), jVar);
                            if (kVar.q) {
                                jVar.e = true;
                                kVar.k(1, andUpdate, null);
                            }
                            kVar.j.execute(new c0(10, kVar, jVar));
                        }
                        try {
                            accept.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e) {
                synchronized (kVar.a) {
                    try {
                        if (kVar.r) {
                            return;
                        }
                        FileLog.e(e);
                        kVar.f();
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] d(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(trim.substring(i11, i11 + 2), 16);
            }
        } else {
            try {
                bArr = Base64.decode(trim, 10);
            } catch (Exception unused) {
                return null;
            }
        }
        if (bArr.length == 16 || (bArr.length == 17 && (bArr[0] & 255) == 221)) {
            return bArr;
        }
        return null;
    }

    public static boolean h() {
        try {
            if (o.a("WEB_MESSAGE_LISTENER")) {
                if (o.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static lf.i i(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String j3 = j(indexOf >= 0 ? str.substring(0, indexOf) : str);
        String substring = indexOf >= 0 ? str.substring(indexOf + 1) : "";
        if (TextUtils.isEmpty(j3) || substring.length() > 128) {
            return null;
        }
        if (!substring.isEmpty()) {
            for (String str2 : substring.split("/", -1)) {
                if (str2.isEmpty() || !Character.isLetterOrDigit(str2.charAt(0))) {
                    return null;
                }
                for (int i10 = 0; i10 < str2.length(); i10++) {
                    char charAt = str2.charAt(i10);
                    if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-'))) {
                        return null;
                    }
                }
            }
        }
        return new lf.i(j3, substring);
    }

    public static String j(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.i(1, 0, trim);
        }
        try {
            String lowerCase = IDN.toASCII(trim, 2).toLowerCase(Locale.US);
            if (lowerCase.length() <= 253 && lowerCase.indexOf(46) > 0 && !lowerCase.contains(":") && !lowerCase.matches("[0-9.]+")) {
                for (String str2 : lowerCase.split("\\.", -1)) {
                    if (str2.isEmpty() || str2.length() > 63 || str2.startsWith("-") || str2.endsWith("-")) {
                        return "";
                    }
                }
                return lowerCase;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static int l(String str, String str2) {
        lf.i i10 = i(str);
        byte[] d = d(str2);
        if (i10 == null || d == null || !h()) {
            return 0;
        }
        synchronized (v) {
            try {
                k kVar = w;
                if (kVar != null && kVar.b.equals((String) i10.d) && w.e.equals(str2)) {
                    return w.i.getLocalPort();
                }
                k kVar2 = w;
                if (kVar2 != null) {
                    kVar2.n();
                    w = null;
                }
                try {
                    k kVar3 = new k(i10, str2, d);
                    w = kVar3;
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null) {
                        g10Var.addListener(kVar3);
                    }
                    kVar3.j.execute(new g(kVar3, 1));
                    AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                    return w.i.getLocalPort();
                } catch (Exception e) {
                    FileLog.e(e);
                    k kVar4 = w;
                    if (kVar4 != null) {
                        kVar4.n();
                        w = null;
                    }
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void m() {
        synchronized (v) {
            try {
                k kVar = w;
                if (kVar != null) {
                    kVar.n();
                    w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        synchronized (this.a) {
            try {
                if (this.m.get(Integer.valueOf(jVar.a)) != jVar) {
                    return;
                }
                this.m.remove(Integer.valueOf(jVar.a));
                boolean z11 = z10 && this.q && jVar.e;
                this.a.notifyAll();
                try {
                    jVar.b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    k(3, jVar.a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.o;
        this.o = null;
        this.p = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (!this.r && !this.s) {
                this.s = true;
                int i10 = 0;
                this.q = false;
                this.p = null;
                this.n.clear();
                this.t = 0;
                ArrayList arrayList = new ArrayList(this.m.values());
                this.m.clear();
                this.a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 3));
            }
        }
    }

    public final void g(String str, b5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if (!"tproxy-android-init".equals(optString) || jSONObject.optInt("v") != 1 || !this.h.equals(jSONObject.optString("nonce"))) {
                if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                    f();
                    return;
                }
                return;
            }
            synchronized (this.a) {
                if (!this.r && this.p == null) {
                    this.p = hVar;
                    k(16, 0, new byte[]{1});
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void k(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.a) {
            if (!this.r && this.n.size() < 8192 && this.t <= 67108864 - array.length) {
                this.n.add(array);
                this.t += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.r) {
                    return;
                }
                this.r = true;
                int i10 = 0;
                this.q = false;
                this.s = false;
                ArrayList arrayList = new ArrayList(this.m.values());
                this.m.clear();
                this.n.clear();
                this.t = 0;
                this.a.notifyAll();
                try {
                    this.i.close();
                } catch (Exception unused) {
                }
                g10 g10Var = g10.getInstance();
                if (g10Var != null) {
                    g10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.j.shutdownNow();
                this.k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.f10
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 2));
    }

    @Override // org.telegram.ui.Components.f10
    public final void onBecameBackground() {
    }
}
