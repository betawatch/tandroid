package b5;

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
import android.provider.Settings;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.clearcut.f2;
import e0.p0;
import java.util.concurrent.atomic.AtomicInteger;
import m.z0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.v9;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class d {
    public static int a;
    public static AtomicInteger b;
    public static boolean c;
    public static int d;
    public static f2 e;

    public static void A(float f7) {
        BasePendingResult basePendingResult;
        e6.h e7 = e();
        if (e7 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        double d10 = f7;
        n6.l.e("Must be called from the main thread.");
        if (e7.w()) {
            e6.m mVar = new e6.m(e7, d10, 0);
            e6.h.x(mVar);
            basePendingResult = mVar;
        } else {
            basePendingResult = e6.h.t();
        }
        basePendingResult.b(new v9(2));
    }

    public static boolean B(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void C() {
        int i10 = a;
        if (i10 == 0) {
            PhotoViewer.t1().i3();
        } else if (i10 == 1) {
            MediaController.getInstance().syncCastedPlayer();
        }
    }

    public static void D(long j3) {
        if (j3 < 0) {
            return;
        }
        e6.h e7 = e();
        long a2 = e7 == null ? -1L : e7.a();
        if (a2 == -1 || Math.abs(a2 - j3) > 1500) {
            v(j3);
        }
    }

    public static Person E(p0 p0Var) {
        Person.Builder name = new Person.Builder().setName(p0Var.a);
        IconCompat iconCompat = p0Var.b;
        return name.setIcon(iconCompat != null ? iconCompat.m(null) : null).setUri(p0Var.c).setKey(p0Var.d).setBot(p0Var.e).setImportant(p0Var.f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i10) {
        d6.a c10;
        a = i10;
        if (c) {
            return;
        }
        try {
            if (f() == null || (c10 = d6.a.c(f())) == null) {
                return;
            }
            c10.b().a(new com.google.android.gms.internal.cast.a(i10));
            c = true;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z10) {
        Context f7;
        AudioManager audioManager;
        f2 f2Var = e;
        if ((f2Var != null) != z10) {
            if (!z10) {
                if (f2Var == null || (f7 = f()) == null) {
                    return;
                }
                f7.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f7.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager2 == null) {
                    return;
                }
                audioManager2.setStreamVolume(3, d, 0);
                C();
                return;
            }
            Context f10 = f();
            if (f10 == null || (audioManager = (AudioManager) f10.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
                return;
            }
            d = audioManager.getStreamVolume(3);
            ContentResolver contentResolver = f10.getContentResolver();
            Uri uri = Settings.System.CONTENT_URI;
            f2 f2Var2 = new f2(new Handler(), 1);
            e = f2Var2;
            contentResolver.registerContentObserver(uri, true, f2Var2);
            A(g());
            audioManager.adjustStreamVolume(3, 0, 1);
        }
    }

    public static e6.h e() {
        d6.c c10;
        if (f() != null) {
            try {
                d6.a c11 = d6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null && c10.b()) {
                    n6.l.e("Must be called from the main thread.");
                    return c10.j;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.G1;
        return launchActivity == null ? ApplicationLoader.applicationContext : launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        Context f7 = f();
        if (f7 == null || (audioManager = (AudioManager) f7.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        return Utilities.clamp01((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume));
    }

    public static String[] h(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int i(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String j(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params p(z0 z0Var) {
        return z0Var.getTextMetricsParams();
    }

    public static int q(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri r(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static final long s(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static ClassLoader t() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean u() {
        d6.c c10;
        if (f() != null) {
            try {
                d6.a c11 = d6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null) {
                    if (c10.c()) {
                        return true;
                    }
                    if (c10.b()) {
                        return true;
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return false;
            }
        }
        return false;
    }

    public static void v(long j3) {
        e6.h e7 = e();
        if (e7 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        e7.q(new c6.p(j3)).b(new v9(3));
    }

    public static void w(int i10, TextView textView) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void x(boolean z10) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        e6.h e7 = e();
        if (e7 == null || z10 == e7.m()) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        if (z10) {
            n6.l.e("Must be called from the main thread.");
            if (e7.w()) {
                e6.j jVar = new e6.j(e7, 6);
                e6.h.x(jVar);
                basePendingResult2 = jVar;
            } else {
                basePendingResult2 = e6.h.t();
            }
            basePendingResult2.b(new v9(0));
            return;
        }
        n6.l.e("Must be called from the main thread.");
        if (e7.w()) {
            e6.j jVar2 = new e6.j(e7, 5);
            e6.h.x(jVar2);
            basePendingResult = jVar2;
        } else {
            basePendingResult = e6.h.t();
        }
        basePendingResult.b(new v9(1));
    }

    public static void y(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void z(float f7) {
        BasePendingResult basePendingResult;
        e6.h e7 = e();
        if (e7 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        double d10 = f7;
        n6.l.e("Must be called from the main thread.");
        if (e7.w()) {
            e6.m mVar = new e6.m(e7, d10, 1);
            e6.h.x(mVar);
            basePendingResult = mVar;
        } else {
            basePendingResult = e6.h.t();
        }
        basePendingResult.b(new v9(4));
    }
}
