package d1;

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
import com.google.android.gms.internal.clearcut.h2;
import e0.p0;
import java.util.concurrent.atomic.AtomicInteger;
import m.a1;
import o5.p;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.s9;
import org.webrtc.MediaStreamTrack;
import q5.h;
import q5.i;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f {
    public static int a;
    public static AtomicInteger b;
    public static boolean c;
    public static int d;
    public static h2 e;

    public static void A(float f9) {
        BasePendingResult basePendingResult;
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        double d10 = f9;
        l.e("Must be called from the main thread.");
        if (e10.w()) {
            q5.l lVar = new q5.l(e10, d10, 0);
            h.x(lVar);
            basePendingResult = lVar;
        } else {
            basePendingResult = h.t();
        }
        basePendingResult.b(new s9(2));
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

    public static void D(long j10) {
        if (j10 < 0) {
            return;
        }
        h e10 = e();
        long a2 = e10 == null ? -1L : e10.a();
        if (a2 == -1 || Math.abs(a2 - j10) > 1500) {
            v(j10);
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
        p5.a c3;
        a = i10;
        if (c) {
            return;
        }
        try {
            if (f() == null || (c3 = p5.a.c(f())) == null) {
                return;
            }
            c3.b().a(new a5.c(i10));
            c = true;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z10) {
        Context f9;
        AudioManager audioManager;
        h2 h2Var = e;
        if ((h2Var != null) != z10) {
            if (!z10) {
                if (h2Var == null || (f9 = f()) == null) {
                    return;
                }
                f9.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f9.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
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
            h2 h2Var2 = new h2(new Handler(), 1);
            e = h2Var2;
            contentResolver.registerContentObserver(uri, true, h2Var2);
            A(g());
            audioManager.adjustStreamVolume(3, 0, 1);
        }
    }

    public static h e() {
        p5.c c3;
        if (f() != null) {
            try {
                p5.a c6 = p5.a.c(f());
                if (c6 != null && (c3 = c6.b().c()) != null && c3.b()) {
                    l.e("Must be called from the main thread.");
                    return c3.j;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.C1;
        return launchActivity == null ? ApplicationLoader.applicationContext : launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        Context f9 = f();
        if (f9 == null || (audioManager = (AudioManager) f9.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
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

    public static PrecomputedText.Params p(a1 a1Var) {
        return a1Var.getTextMetricsParams();
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
        p5.c c3;
        if (f() != null) {
            try {
                p5.a c6 = p5.a.c(f());
                if (c6 != null && (c3 = c6.b().c()) != null) {
                    if (c3.c()) {
                        return true;
                    }
                    if (c3.b()) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        return false;
    }

    public static void v(long j10) {
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        e10.q(new p(j10)).b(new s9(3));
    }

    public static void w(int i10, TextView textView) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void x(boolean z10) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        h e10 = e();
        if (e10 == null || z10 == e10.m()) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        if (z10) {
            l.e("Must be called from the main thread.");
            if (e10.w()) {
                i iVar = new i(e10, 6);
                h.x(iVar);
                basePendingResult2 = iVar;
            } else {
                basePendingResult2 = h.t();
            }
            basePendingResult2.b(new s9(0));
            return;
        }
        l.e("Must be called from the main thread.");
        if (e10.w()) {
            i iVar2 = new i(e10, 5);
            h.x(iVar2);
            basePendingResult = iVar2;
        } else {
            basePendingResult = h.t();
        }
        basePendingResult.b(new s9(1));
    }

    public static void y(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void z(float f9) {
        BasePendingResult basePendingResult;
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        double d10 = f9;
        l.e("Must be called from the main thread.");
        if (e10.w()) {
            q5.l lVar = new q5.l(e10, d10, 1);
            h.x(lVar);
            basePendingResult = lVar;
        } else {
            basePendingResult = h.t();
        }
        basePendingResult.b(new s9(4));
    }
}
