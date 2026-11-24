// default package

import android.app.Application;
import android.app.Notification;
import android.app.Person;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fp {
    public static boolean a;
    public static AtomicInteger b;
    public static boolean c;
    public static int d;
    public static pe1 e;
    public static String f;
    public static int g;
    public static Boolean h;

    public static void A(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static void B(float f2) {
        BasePendingResult basePendingResult;
        k89 e2 = e();
        if (e2 == null) {
            return;
        }
        AtomicInteger atomicInteger = b;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        double d2 = f2;
        ite.e("Must be called from the main thread.");
        if (e2.w()) {
            wdd wddVar = new wdd(e2, d2, (byte) 1);
            k89.x(wddVar);
            basePendingResult = wddVar;
        } else {
            basePendingResult = k89.t();
        }
        basePendingResult.b(new ne1((byte) 4));
    }

    public static void C(float f2) {
        BasePendingResult basePendingResult;
        k89 e2 = e();
        if (e2 == null) {
            return;
        }
        AtomicInteger atomicInteger = b;
        byte b2 = 0;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        double d2 = f2;
        ite.e("Must be called from the main thread.");
        if (e2.w()) {
            wdd wddVar = new wdd(e2, d2, b2);
            k89.x(wddVar);
            basePendingResult = wddVar;
        } else {
            basePendingResult = k89.t();
        }
        basePendingResult.b(new ne1((byte) 2));
    }

    public static boolean D(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void E() {
        AtomicInteger atomicInteger;
        f07 e2;
        long j;
        boolean z = a;
        if (!z) {
            PhotoViewer.r0().s2();
            return;
        }
        if (z) {
            MediaController w = MediaController.w();
            if (w.v0 != null) {
                w.U1 = true;
                if (w() && ((atomicInteger = b) == null || atomicInteger.get() <= 0)) {
                    k89 e3 = e();
                    long a2 = e3 == null ? -1L : e3.a();
                    long y = w.y(w.v0);
                    if (y >= 0 && a2 >= 0 && Math.abs(y - a2) > 1000) {
                        k47 k47Var = w.v0;
                        if ((w.j0 != null || w.F0 != null) && k47Var != null && w.G(k47Var)) {
                            try {
                                ndc ndcVar = w.j0;
                                if (ndcVar != null) {
                                    j = ndcVar.U();
                                    if (j != -9223372036854775807L) {
                                        k47Var.b0 = Utilities.l(a2 / j);
                                    }
                                    w.j0.p0(a2, false);
                                    k47Var.e0 = a2;
                                    if (!w.U1) {
                                        x(a2);
                                    }
                                } else {
                                    ndc ndcVar2 = w.F0;
                                    if (ndcVar2 != null) {
                                        j = ndcVar2.U();
                                        w.F0.o0(a2);
                                        if (!w.U1) {
                                            x(a2);
                                        }
                                    } else {
                                        j = 1;
                                    }
                                }
                                if (j != 0) {
                                    nm7.f(k47Var.K1).k(nm7.i2, Integer.valueOf(k47Var.e1()), Float.valueOf(Utilities.l(a2 / j)));
                                }
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                        }
                    }
                    k89 e5 = e();
                    boolean m = e5 == null ? false : !a ? !e5.l() : e5.m();
                    k47 k47Var2 = w.v0;
                    if (m) {
                        w.R(k47Var2);
                    } else {
                        w.Q(k47Var2, true);
                    }
                    k89 e6 = e();
                    float f2 = 1.0f;
                    if (e6 != null && (e2 = e6.e()) != null) {
                        f2 = (float) e2.d;
                    }
                    w.l0(true, f2);
                }
                w.m0();
                w.U1 = false;
            }
        }
    }

    public static void F(long j) {
        if (j >= 0) {
            k89 e2 = e();
            long a2 = e2 == null ? -1L : e2.a();
            if (a2 == -1 || Math.abs(a2 - j) > 1500) {
                x(j);
            }
        }
    }

    public static Person G(n58 n58Var) {
        Person.Builder name = new Person.Builder().setName(n58Var.a);
        IconCompat iconCompat = n58Var.b;
        return name.setIcon(iconCompat != null ? pme.a(iconCompat, null) : null).setUri(n58Var.c).setKey(n58Var.d).setBot(n58Var.e).setImportant(n58Var.f).build();
    }

    public static boolean H() {
        Boolean bool = h;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke == null) {
                        throw new rq2(n7f.a("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            h = bool;
        }
        return bool.booleanValue();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(int i) {
        ie1 c2;
        a = i;
        if (c) {
            return;
        }
        try {
            if (f() == null || (c2 = ie1.c(f())) == null) {
                return;
            }
            c2.b().a(new gp5(i));
            c = true;
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z) {
        Context f2;
        AudioManager audioManager;
        pe1 pe1Var = e;
        byte b2 = 0;
        if ((pe1Var != null) != z) {
            if (!z) {
                if (pe1Var == null || (f2 = f()) == null) {
                    return;
                }
                f2.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager2 != null) {
                    audioManager2.setStreamVolume(3, d, 0);
                    E();
                    return;
                }
                return;
            }
            Context f3 = f();
            if (f3 == null || (audioManager = (AudioManager) f3.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
                return;
            }
            d = audioManager.getStreamVolume(3);
            ContentResolver contentResolver = f3.getContentResolver();
            Uri uri = Settings.System.CONTENT_URI;
            pe1 pe1Var2 = new pe1(new Handler(), b2);
            e = pe1Var2;
            contentResolver.registerContentObserver(uri, true, pe1Var2);
            C(g());
            audioManager.adjustStreamVolume(3, 0, 1);
        }
    }

    public static k89 e() {
        me1 c2;
        if (f() != null) {
            try {
                ie1 c3 = ie1.c(f());
                if (c3 != null && (c2 = c3.b().c()) != null && c2.b()) {
                    ite.e("Must be called from the main thread.");
                    return c2.j;
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.H1;
        return launchActivity == null ? a.b : launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        Context f2 = f();
        if (f2 == null || (audioManager = (AudioManager) f2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        return Utilities.l((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume));
    }

    public static String[] h(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor i(Context context) {
        return context.getMainExecutor();
    }

    public static String j() {
        BufferedReader bufferedReader;
        String str = f;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            f = processName;
            return processName;
        }
        int i = g;
        if (i == 0) {
            i = Process.myPid();
            g = i;
        }
        String str2 = null;
        str2 = null;
        str2 = null;
        BufferedReader bufferedReader2 = null;
        if (i > 0) {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                sb.append("/proc/");
                sb.append(i);
                sb.append("/cmdline");
                String sb2 = sb.toString();
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                    try {
                        String readLine = bufferedReader.readLine();
                        ite.h(readLine);
                        str2 = readLine.trim();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        hme.a(bufferedReader2);
                        throw th;
                    }
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
            hme.a(bufferedReader);
        }
        f = str2;
        return str2;
    }

    public static int k(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String l(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params r(sr srVar) {
        return srVar.getTextMetricsParams();
    }

    public static int s(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri t(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static final long u(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static ClassLoader v() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean w() {
        me1 c2;
        if (f() != null) {
            try {
                ie1 c3 = ie1.c(f());
                if (c3 != null && (c2 = c3.b().c()) != null) {
                    if (!c2.c()) {
                        if (c2.b()) {
                        }
                    }
                    return true;
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
                return false;
            }
        }
        return false;
    }

    public static void x(long j) {
        k89 e2 = e();
        if (e2 == null) {
            return;
        }
        AtomicInteger atomicInteger = b;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        e2.q(new nw6(j)).b(new ne1((byte) 3));
    }

    public static void y(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void z(boolean z) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        k89 e2 = e();
        if (e2 == null || z == e2.m()) {
            return;
        }
        AtomicInteger atomicInteger = b;
        byte b2 = 0;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        if (z) {
            ite.e("Must be called from the main thread.");
            if (e2.w()) {
                z7d z7dVar = new z7d(e2, (byte) 6);
                k89.x(z7dVar);
                basePendingResult2 = z7dVar;
            } else {
                basePendingResult2 = k89.t();
            }
            basePendingResult2.b(new ne1(b2));
            return;
        }
        ite.e("Must be called from the main thread.");
        if (e2.w()) {
            z7d z7dVar2 = new z7d(e2, (byte) 5);
            k89.x(z7dVar2);
            basePendingResult = z7dVar2;
        } else {
            basePendingResult = k89.t();
        }
        basePendingResult.b(new ne1((byte) 1));
    }
}
