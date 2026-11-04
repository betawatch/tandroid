package e2;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.MenuItem;
import ci.e0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h {
    public static AudioManager a;

    public static void a(AudioManager audioManager, g gVar) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(gVar.b);
            return;
        }
        Object obj = gVar.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean d(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i3 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i3 == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (h.class) {
            synchronized (h.class) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        a = null;
                    }
                    AudioManager audioManager = a;
                    if (audioManager != null) {
                        return audioManager;
                    }
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null && myLooper != Looper.getMainLooper()) {
                        g2.j jVar = new g2.j();
                        g2.a.e().execute(new e0(29, applicationContext, jVar));
                        jVar.b();
                        AudioManager audioManager2 = a;
                        audioManager2.getClass();
                        return audioManager2;
                    }
                    AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    a = audioManager3;
                    audioManager3.getClass();
                    return audioManager3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0025, code lost:
    
        if (r0 == Integer.MIN_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(AudioManager audioManager, g gVar) {
        int volumeControlStream;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Object obj = gVar.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = gVar.b;
        d2.f fVar = gVar.d;
        fVar.getClass();
        if (i3 >= 26) {
            try {
                volumeControlStream = fVar.b().getVolumeControlStream();
            } catch (RuntimeException unused) {
            }
        } else {
            if ((fVar.b & 1) != 1) {
                switch (fVar.c) {
                    case 2:
                        volumeControlStream = 0;
                        break;
                    case 3:
                        volumeControlStream = 8;
                        break;
                    case 4:
                        volumeControlStream = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        volumeControlStream = 5;
                        break;
                    case 6:
                        volumeControlStream = 2;
                        break;
                    case 11:
                        volumeControlStream = 10;
                        break;
                    case 12:
                    default:
                        volumeControlStream = 3;
                        break;
                    case 13:
                        break;
                }
            }
            volumeControlStream = 1;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, volumeControlStream, gVar.a);
    }

    public static void g(MenuItem menuItem, char c2, int i3) {
        menuItem.setAlphabeticShortcut(c2, i3);
    }

    public static void h(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void j(Notification.Builder builder, int i3) {
        builder.setGroupAlertBehavior(i3);
    }

    public static void k(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void l(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void m(MenuItem menuItem, char c2, int i3) {
        menuItem.setNumericShortcut(c2, i3);
    }

    public static void n(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void o(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void p(Notification.Builder builder, long j10) {
        builder.setTimeoutAfter(j10);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
