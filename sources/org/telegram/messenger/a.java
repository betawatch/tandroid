package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.utils.twidget.WidgetEngineService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class a extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static b I = null;
    public static ize J = null;
    public static xl3 K = null;
    public static a a = null;
    public static volatile Context b = null;
    public static volatile NetworkInfo c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f = false;
    public static volatile vr h = null;
    public static long n = 0;
    public static int r = -1;
    public static long s = 0;
    public static volatile boolean w = false;
    public static volatile boolean x = true;
    public static volatile boolean y = true;

    public static void a(Throwable th) {
        ((ApplicationLoaderImpl) a).getClass();
        try {
            lg4 lg4Var = (lg4) jg4.c().b(lg4.class);
            if (lg4Var == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            if (th == null) {
                Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                return;
            }
            rc1 rc1Var = lg4Var.a;
            Map map = Collections.EMPTY_MAP;
            ((pz2) ((mv6) rc1Var.n).b).a(new gu2(rc1Var, th));
        } catch (Throwable th2) {
            fa4.g(th2, false);
        }
    }

    public static void c(boolean z) {
        if (z || c == null) {
            try {
                ConnectivityManager connectivityManager = e;
                if (connectivityManager == null) {
                    connectivityManager = (ConnectivityManager) b.getSystemService("connectivity");
                    e = connectivityManager;
                }
                c = connectivityManager.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT < 24 || h != null) {
                    return;
                }
                h = new vr();
                e.registerDefaultNetworkCallback(h);
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        a.getClass();
    }

    public static int e() {
        int i;
        try {
            c(false);
            if (c != null) {
                if (c.getType() == 1 || c.getType() == 9) {
                    if (Build.VERSION.SDK_INT >= 24 && (((i = r) == 0 || i == 1) && System.currentTimeMillis() - n < 5000)) {
                        return r;
                    }
                    if (e.isActiveNetworkMetered()) {
                        r = 0;
                    } else {
                        r = 1;
                    }
                    n = System.currentTimeMillis();
                    return r;
                }
                if (c.isRoaming()) {
                    return 2;
                }
            }
            return 0;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return 0;
        }
    }

    public static int f() {
        if (n()) {
            return 1;
        }
        return s() ? 2 : 0;
    }

    public static File h() {
        for (int i = 0; i < 10; i++) {
            File filesDir = b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static ILocationServiceProvider i() {
        if (K == null) {
            a.getClass();
            xl3 xl3Var = new xl3((byte) 6);
            K = xl3Var;
            xl3Var.init(b);
        }
        return K;
    }

    public static IMapsProvider j() {
        ize izeVar = J;
        if (izeVar != null) {
            return izeVar;
        }
        a.getClass();
        ize izeVar2 = new ize((byte) 20);
        J = izeVar2;
        return izeVar2;
    }

    public static PushListenerController.IPushListenerServiceProvider k() {
        b bVar = I;
        if (bVar != null) {
            return bVar;
        }
        a.getClass();
        b bVar2 = b.b;
        I = bVar2;
        return bVar2;
    }

    public static void l() {
        a.getClass();
    }

    public static void m() {
        a.getClass();
    }

    public static boolean n() {
        try {
            c(false);
            if (c != null && (c.getType() == 1 || c.getType() == 9)) {
                NetworkInfo.State state = c.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static boolean o() {
        try {
            c(false);
            if (c != null && (c.getType() == 1 || c.getType() == 9)) {
                if (c.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static boolean p() {
        try {
            c(false);
            if (c != null && c.getType() == 0) {
                int subtype = c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void q() {
        a.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r1.isConnectedOrConnecting() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r() {
        NetworkInfo networkInfo;
        boolean z = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo == null || (!activeNetworkInfo.isConnectedOrConnecting() && !activeNetworkInfo.isAvailable())) && ((networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnectedOrConnecting())) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null) {
                }
                z = false;
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        boolean z2 = w01.a;
        return z;
    }

    public static boolean s() {
        try {
            c(false);
            if (c != null) {
                if (c.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static void t() {
        a.getClass();
    }

    public static void v() {
        byte b2;
        if (f || b == null) {
            return;
        }
        byte b3 = 1;
        f = true;
        gi7.c(b);
        try {
            k96.D0();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        byte b4 = 0;
        try {
            e = (ConnectivityManager) b.getSystemService("connectivity");
            b.registerReceiver(new tr(b4), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            b.registerReceiver(new tr((byte) 3), intentFilter);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            e66.h(b.registerReceiver(new tr(b3), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        try {
            w = ((PowerManager) b.getSystemService("power")).isScreenOn();
            if (w01.a) {
                fa4.b("screen state = " + w);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        gba.s();
        bue.a = b.getSharedPreferences("webview_bots", 0);
        int i = 0;
        while (true) {
            b2 = 4;
            if (i >= 4) {
                break;
            }
            y6c.h(i).r();
            na7.q1(i);
            if (i == 0) {
                gba.g = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i).getCurrentTime() + "__";
            } else {
                ConnectionsManager.getInstance(i);
            }
            TLRPC.User f2 = y6c.h(i).f();
            if (f2 != null) {
                na7.q1(i).a4(f2, true, false);
                ad7 messagesStorage = z3a.B(i).getMessagesStorage();
                messagesStorage.a.c(new vb7(messagesStorage, (byte) 22));
            }
            i++;
        }
        ((a) b).getClass();
        gl.d3(new jc((byte) 8), 1000L);
        if (w01.a) {
            fa4.b("app initied");
        }
        MediaController.w();
        for (int i2 = 0; i2 < 4; i2++) {
            qu2 r2 = qu2.r(i2);
            r2.a = null;
            Utilities.e.c(new wt2(r2, b4));
            up3.q(i2);
        }
        ci0.h().q();
        gl.d3(new jc(b2), 3000L);
    }

    public static void w() {
        SharedPreferences d1 = na7.d1();
        if (!(d1.contains("pushService") ? d1.getBoolean("pushService", true) : na7.q1(y6c.t0).X3.getBoolean("keepAliveService", false))) {
            b.stopService(new Intent(b, (Class<?>) NotificationsService.class));
        } else {
            try {
                b.startService(new Intent(b, (Class<?>) NotificationsService.class));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final boolean b(Context context) {
        if (Build.VERSION.SDK_INT < 26 || b.getPackageManager().canRequestPackageInstalls()) {
            return true;
        }
        ij.j(context, null).show();
        return false;
    }

    public final File g() {
        oh0 e2 = oh0.e();
        if (e2.d == null) {
            return null;
        }
        File file = new File(e2.d);
        if (file.exists()) {
            return file;
        }
        e2.d = null;
        e2.f();
        return null;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            k96.D0().W0(configuration);
            gl.v(b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            gl.Y2();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        String str;
        a = this;
        try {
            b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.d()) {
            return;
        }
        Typeface typeface = gl.a;
        if (w01.a) {
            fa4.b("Hello World!");
            StringBuilder sb = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s = elapsedRealtime;
            ug8.q(elapsedRealtime, sb);
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
                int i = packageInfo.versionCode % 10;
                if (i == 1 || i == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    t();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i2 = packageInfo.versionCode;
                fa4.b("buildVersion = ".concat("v" + str2 + " (" + (i2 / 10) + "[" + (i2 % 10) + "]) " + str));
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            StringBuilder sb2 = new StringBuilder("device = manufacturer=");
            sb2.append(Build.MANUFACTURER);
            sb2.append(", device=");
            sb2.append(Build.DEVICE);
            sb2.append(", model=");
            sb2.append(Build.MODEL);
            sb2.append(", product=");
            de9.s(Build.PRODUCT, sb2);
        }
        if (b == null) {
            b = getApplicationContext();
        }
        gi7.c(b);
        try {
            ConnectionsManager.native_setJava(false);
            new ur(this);
            new d1(new jc((byte) 5));
            if (w01.a) {
                fa4.b("load libs time = " + (SystemClock.elapsedRealtime() - s));
            }
            d = new Handler(b.getMainLooper());
            gl.c3(new jc((byte) 6));
            c06[] values = c06.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jme.b(c06.h);
                    break;
                } else if (jme.a(values[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            zt8 zt8Var = zt8.c;
            for (int i4 = 0; i4 < 4; i4++) {
                kk7.f(i4).a(zt8Var, kk7.S1);
            }
            kk7.e().a(zt8Var, kk7.D4);
            kk7.e().a(zt8Var, kk7.C4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + gi7.a());
        }
    }

    public abstract boolean u(Activity activity, TLRPC.Document document);
}
