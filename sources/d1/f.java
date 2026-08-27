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
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.clearcut.h2;
import e0.p0;
import java.util.concurrent.atomic.AtomicInteger;
import m.a1;
import m5.q;
import o5.h;
import o5.i;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.u9;
import org.webrtc.MediaStreamTrack;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class f {
    public static int a;
    public static AtomicInteger b;
    public static boolean c;
    public static int d;
    public static h2 e;

    public static boolean A(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void B() {
        int i10 = a;
        if (i10 == 0) {
            PhotoViewer.t1().i3();
        } else if (i10 == 1) {
            MediaController.getInstance().syncCastedPlayer();
        }
    }

    public static void C(long j10) {
        if (j10 < 0) {
            return;
        }
        h e9 = e();
        long a2 = e9 == null ? -1L : e9.a();
        if (a2 == -1 || Math.abs(a2 - j10) > 1500) {
            u(j10);
        }
    }

    public static Person D(p0 p0Var) {
        Person.Builder name = new Person.Builder().setName(p0Var.a);
        IconCompat iconCompat = p0Var.b;
        return name.setIcon(iconCompat != null ? iconCompat.m(null) : null).setUri(p0Var.c).setKey(p0Var.d).setBot(p0Var.e).setImportant(p0Var.f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i10) {
        n5.a c10;
        a = i10;
        if (c) {
            return;
        }
        try {
            if (f() == null || (c10 = n5.a.c(f())) == null) {
                return;
            }
            c10.b().a(new com.google.android.gms.internal.cast.a(i10));
            c = true;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z10) {
        Context f10;
        AudioManager audioManager;
        h2 h2Var = e;
        if ((h2Var != null) != z10) {
            if (!z10) {
                if (h2Var == null || (f10 = f()) == null) {
                    return;
                }
                f10.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f10.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager2 == null) {
                    return;
                }
                audioManager2.setStreamVolume(3, d, 0);
                B();
                return;
            }
            Context f11 = f();
            if (f11 == null || (audioManager = (AudioManager) f11.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
                return;
            }
            d = audioManager.getStreamVolume(3);
            ContentResolver contentResolver = f11.getContentResolver();
            Uri uri = Settings.System.CONTENT_URI;
            h2 h2Var2 = new h2(new Handler(), 1);
            e = h2Var2;
            contentResolver.registerContentObserver(uri, true, h2Var2);
            z(g());
            audioManager.adjustStreamVolume(3, 0, 1);
        }
    }

    public static h e() {
        n5.c c10;
        if (f() != null) {
            try {
                n5.a c11 = n5.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null && c10.b()) {
                    l.e("Must be called from the main thread.");
                    return c10.j;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
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
        Context f10 = f();
        if (f10 == null || (audioManager = (AudioManager) f10.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) == null) {
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

    public static boolean t() {
        n5.c c10;
        if (f() != null) {
            try {
                n5.a c11 = n5.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null) {
                    if (c10.c()) {
                        return true;
                    }
                    if (c10.b()) {
                        return true;
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return false;
            }
        }
        return false;
    }

    public static void u(long j10) {
        h e9 = e();
        if (e9 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        e9.q(new q(j10)).b(new u9(3));
    }

    public static void v(int i10, TextView textView) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void w(boolean z10) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        h e9 = e();
        if (e9 == null || z10 == e9.m()) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        if (z10) {
            l.e("Must be called from the main thread.");
            if (e9.w()) {
                i iVar = new i(e9, 6);
                h.x(iVar);
                basePendingResult2 = iVar;
            } else {
                basePendingResult2 = h.t();
            }
            basePendingResult2.b(new u9(0));
            return;
        }
        l.e("Must be called from the main thread.");
        if (e9.w()) {
            i iVar2 = new i(e9, 5);
            h.x(iVar2);
            basePendingResult = iVar2;
        } else {
            basePendingResult = h.t();
        }
        basePendingResult.b(new u9(1));
    }

    public static void x(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void y(float f10) {
        BasePendingResult basePendingResult;
        h e9 = e();
        if (e9 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        double d10 = f10;
        l.e("Must be called from the main thread.");
        if (e9.w()) {
            o5.l lVar = new o5.l(e9, d10, 1);
            h.x(lVar);
            basePendingResult = lVar;
        } else {
            basePendingResult = h.t();
        }
        basePendingResult.b(new u9(4));
    }

    public static void z(float f10) {
        BasePendingResult basePendingResult;
        h e9 = e();
        if (e9 == null) {
            return;
        }
        if (b == null) {
            b = new AtomicInteger(0);
        }
        b.incrementAndGet();
        double d10 = f10;
        l.e("Must be called from the main thread.");
        if (e9.w()) {
            o5.l lVar = new o5.l(e9, d10, 0);
            h.x(lVar);
            basePendingResult = lVar;
        } else {
            basePendingResult = h.t();
        }
        basePendingResult.b(new u9(2));
    }
}
