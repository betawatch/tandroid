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
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ba0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w0 extends Application {
    public static volatile boolean D = true;
    public static volatile boolean E = true;
    public static boolean F = false;
    public static volatile long G = 0;
    public static eu H = null;
    public static t7.u I = null;
    public static li.k J = null;
    public static w0 a = null;
    public static volatile Context b = null;
    public static volatile NetworkInfo c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f = false;
    public static volatile v0 h = null;
    public static long n = 0;
    public static int r = -1;
    public static long s = 0;
    public static volatile boolean w = false;
    public static volatile boolean x = true;
    public static volatile boolean y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) a).getClass();
        try {
            t9.c cVar = (t9.c) l9.h.c().b(t9.c.class);
            if (cVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            cVar.a(th2);
        } catch (Throwable th3) {
            f8.g(th3, false);
        }
    }

    public static void c(boolean z10) {
        if (z10 || c == null) {
            try {
                if (e == null) {
                    e = (ConnectivityManager) b.getSystemService("connectivity");
                }
                c = e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT < 24 || h != null) {
                    return;
                }
                h = new v0();
                e.registerDefaultNetworkCallback(h);
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        a.getClass();
    }

    public static int e() {
        int i10;
        try {
            c(false);
            if (c != null) {
                if (c.getType() != 1 && c.getType() != 9) {
                    if (c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i10 = r) == 0 || i10 == 1) && System.currentTimeMillis() - n < 5000)) {
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
            return 0;
        } catch (Exception e7) {
            f8.g(e7, true);
            return 0;
        }
    }

    public static int f() {
        if (o()) {
            return 1;
        }
        return t() ? 2 : 0;
    }

    public static File h() {
        for (int i10 = 0; i10 < 10; i10++) {
            File filesDir = b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e7) {
            f8.g(e7, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static File i() {
        try {
            File file = new File(h(), "rasterized/wallpaper");
            file.mkdirs();
            return file;
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static ILocationServiceProvider j() {
        if (J == null) {
            a.getClass();
            li.k kVar = new li.k(14);
            J = kVar;
            kVar.init(b);
        }
        return J;
    }

    public static IMapsProvider k() {
        if (I == null) {
            a.getClass();
            I = new t7.u(13);
        }
        return I;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (H == null) {
            a.getClass();
            H = eu.b;
        }
        return H;
    }

    public static void m() {
        a.getClass();
    }

    public static void n() {
        a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (c != null) {
                if (c.getType() != 1) {
                    if (c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = c.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e7) {
            f8.g(e7, true);
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

    public static void r() {
        a.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r1.isConnectedOrConnecting() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s() {
        NetworkInfo networkInfo;
        boolean z10 = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo == null || (!activeNetworkInfo.isConnectedOrConnecting() && !activeNetworkInfo.isAvailable())) && ((networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnectedOrConnecting())) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null) {
                }
                z10 = false;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        boolean z11 = v2.a;
        return z10;
    }

    public static boolean t() {
        try {
            c(false);
            if (c != null) {
                if (c.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static void u() {
        a.getClass();
    }

    public static void w() {
        if (f || b == null) {
            return;
        }
        f = true;
        js.g(b);
        try {
            cd.D0();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            e = (ConnectivityManager) b.getSystemService("connectivity");
            b.registerReceiver(new t0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            b.registerReceiver(new t0(3), intentFilter);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            sc.h(b.registerReceiver(new t0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        try {
            w = ((PowerManager) b.getSystemService("power")).isScreenOn();
            if (v2.a) {
                f8.b("screen state = " + w);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        tz.t();
        js.i = b.getSharedPreferences("webview_bots", 0);
        for (int i10 = 0; i10 < 4; i10++) {
            d20.i(i10).s();
            vp.r1(i10);
            if (i10 == 0) {
                tz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i10).getCurrentTime() + "__";
            } else {
                ConnectionsManager.getInstance(i10);
            }
            TLRPC.User f7 = d20.i(i10).f();
            if (f7 != null) {
                vp.r1(i10).U3(f7, true, false);
                hs messagesStorage = qz.C(i10).getMessagesStorage();
                messagesStorage.a.c(new br(messagesStorage, 29));
            }
        }
        ((w0) b).getClass();
        i0.h3(new ag.f3(12), 1000L);
        if (v2.a) {
            f8.b("app initied");
        }
        MediaController.B();
        for (int i11 = 0; i11 < 4; i11++) {
            i5 r10 = i5.r(i11);
            r10.a = null;
            Utilities.e.c(new a5(r10, 0));
            b6.q(i11);
        }
        u1.i().q();
    }

    public static void x() {
        SharedPreferences e12 = vp.e1();
        if (!(e12.contains("pushService") ? e12.getBoolean("pushService", true) : vp.r1(d20.s0).f7.getBoolean("keepAliveService", false))) {
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

    public abstract boolean b(Context context);

    public abstract File g();

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            cd.D0().T0(configuration);
            i0.v(b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            i0.c3();
        } catch (Exception e7) {
            e7.printStackTrace();
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
        Typeface typeface = i0.a;
        int i10 = 10;
        if (v2.a) {
            f8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s = elapsedRealtime;
            i0.a.q(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
                int i11 = packageInfo.versionCode % 10;
                if (i11 == 1 || i11 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i12 = packageInfo.versionCode;
                f8.b("buildVersion = ".concat("v" + str2 + " (" + (i12 / 10) + "[" + (i12 % 10) + "]) " + str));
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            StringBuilder sb3 = new StringBuilder("device = manufacturer=");
            sb3.append(Build.MANUFACTURER);
            sb3.append(", device=");
            sb3.append(Build.DEVICE);
            sb3.append(", model=");
            sb3.append(Build.MODEL);
            sb3.append(", product=");
            a1.g.z(Build.PRODUCT, sb3);
        }
        if (b == null) {
            b = getApplicationContext();
        }
        js.g(b);
        try {
            ConnectionsManager.native_setJava(false);
            new u0(this);
            new b(new ag.f3(i10));
            if (v2.a) {
                f8.b("load libs time = " + (SystemClock.elapsedRealtime() - s));
            }
            d = new Handler(b.getMainLooper());
            i0.g3(new ag.f3(11));
            ba0[] values = ba0.values();
            int length = values.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    w7.j6.b(ba0.h);
                    break;
                } else if (w7.j6.a(values[i13])) {
                    break;
                } else {
                    i13++;
                }
            }
            bu buVar = bu.c;
            for (int i14 = 0; i14 < 4; i14++) {
                zs.f(i14).b(buVar, zs.T1);
            }
            zs.e().b(buVar, zs.B4);
            zs.e().b(buVar, zs.A4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + js.e());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
