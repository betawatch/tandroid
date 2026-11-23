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
import org.telegram.ui.y80;
import org.telegram.utils.twidget.WidgetEngineService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class t0 extends Application {
    public static volatile boolean E = true;
    public static volatile boolean F = true;
    public static boolean G = false;
    public static volatile long H = 0;
    public static nt I = null;
    public static pb.b J = null;
    public static h6.m K = null;
    public static t0 a = null;
    public static volatile Context b = null;
    public static volatile NetworkInfo c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f = false;
    public static volatile s0 h = null;
    public static long n = 0;
    public static int r = -1;
    public static long s = 0;
    public static volatile boolean w = false;
    public static volatile boolean x = true;
    public static volatile boolean y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            if (th2 == null) {
                Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                return;
            }
            aa.t tVar = bVar.a;
            Map map = Collections.EMPTY_MAP;
            tVar.n.a.a(new a1.e(tVar, th2));
        } catch (Throwable th3) {
            a8.g(th3, false);
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
                h = new s0();
                e.registerDefaultNetworkCallback(h);
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (c != null) {
                if (c.getType() != 1 && c.getType() != 9) {
                    if (c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = r) == 0 || i7 == 1) && System.currentTimeMillis() - n < 5000)) {
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
        } catch (Exception e10) {
            a8.g(e10, true);
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
        for (int i7 = 0; i7 < 10; i7++) {
            File filesDir = b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static File i() {
        try {
            File file = new File(h(), "rasterized/wallpaper");
            file.mkdirs();
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static ILocationServiceProvider j() {
        if (K == null) {
            a.getClass();
            h6.m mVar = new h6.m();
            K = mVar;
            mVar.init(b);
        }
        return K;
    }

    public static IMapsProvider k() {
        if (J == null) {
            a.getClass();
            J = new pb.b(17);
        }
        return J;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (I == null) {
            a.getClass();
            I = nt.b;
        }
        return I;
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
        } catch (Exception e10) {
            a8.g(e10, true);
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
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        boolean z11 = s2.a;
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
        } catch (Exception e10) {
            a8.g(e10, true);
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
        vr.f(b);
        try {
            gd.E0();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            e = (ConnectivityManager) b.getSystemService("connectivity");
            b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            b.registerReceiver(new q0(3), intentFilter);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            pc.h(b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            w = ((PowerManager) b.getSystemService("power")).isScreenOn();
            if (s2.a) {
                a8.b("screen state = " + w);
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        bz.t();
        c6.g = b.getSharedPreferences("webview_bots", 0);
        for (int i7 = 0; i7 < 4; i7++) {
            i10.i(i7).s();
            mp.u1(i7);
            if (i7 == 0) {
                bz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
            } else {
                ConnectionsManager.getInstance(i7);
            }
            TLRPC.User f10 = i10.i(i7).f();
            if (f10 != null) {
                mp.u1(i7).e4(f10, true, false);
                tr messagesStorage = zy.C(i7).getMessagesStorage();
                messagesStorage.a.c(new pq(messagesStorage, 22));
            }
        }
        ((t0) b).getClass();
        g0.h3(new ai.k(29), 1000L);
        if (s2.a) {
            a8.b("app initied");
        }
        MediaController.B();
        for (int i10 = 0; i10 < 4; i10++) {
            i5 r10 = i5.r(i10);
            r10.a = null;
            Utilities.e.c(new m4(r10, 0));
            a6.q(i10);
        }
        r1.i().q();
        g0.h3(new ai.k(25), 3000L);
    }

    public static void x() {
        SharedPreferences h12 = mp.h1();
        if (!(h12.contains("pushService") ? h12.getBoolean("pushService", true) : mp.u1(i10.t0).h7.getBoolean("keepAliveService", false))) {
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
            gd.E0().X0(configuration);
            g0.v(b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.c3();
        } catch (Exception e10) {
            e10.printStackTrace();
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
        if (WidgetEngineService.b()) {
            return;
        }
        Typeface typeface = g0.a;
        if (s2.a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s = elapsedRealtime;
            i5.c.v(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
                int i7 = packageInfo.versionCode % 10;
                if (i7 == 1 || i7 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i10 = packageInfo.versionCode;
                a8.b("buildVersion = ".concat("v" + str2 + " (" + (i10 / 10) + "[" + (i10 % 10) + "]) " + str));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            StringBuilder sb3 = new StringBuilder("device = manufacturer=");
            sb3.append(Build.MANUFACTURER);
            sb3.append(", device=");
            sb3.append(Build.DEVICE);
            sb3.append(", model=");
            sb3.append(Build.MODEL);
            sb3.append(", product=");
            p5.c.s(Build.PRODUCT, sb3);
        }
        if (b == null) {
            b = getApplicationContext();
        }
        vr.f(b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.k(26));
            if (s2.a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - s));
            }
            d = new Handler(b.getMainLooper());
            g0.g3(new ai.k(27));
            y80[] values = y80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    c8.za.b(y80.h);
                    break;
                } else if (c8.za.a(values[i11])) {
                    break;
                } else {
                    i11++;
                }
            }
            kt ktVar = kt.c;
            for (int i12 = 0; i12 < 4; i12++) {
                ks.f(i12).b(ktVar, ks.T1);
            }
            ks.e().b(ktVar, ks.E4);
            ks.e().b(ktVar, ks.D4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + vr.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
