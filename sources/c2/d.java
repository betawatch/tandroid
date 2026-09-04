package c2;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.ViewConfiguration;
import bi.s8;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class d {
    public static AudioManager a;

    public static void a(AudioManager audioManager, c cVar) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(cVar.b);
            return;
        }
        Object obj = cVar.f;
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
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (d.class) {
            synchronized (d.class) {
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
                        e2.g gVar = new e2.g();
                        e2.a.g().execute(new s8(16, applicationContext, gVar));
                        gVar.b();
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

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static int h(AudioManager audioManager, c cVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = cVar.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = cVar.b;
        b2.e eVar = cVar.d;
        int i10 = 1;
        if ((eVar.b & 1) != 1) {
            switch (eVar.c) {
                case 2:
                    i10 = 0;
                    break;
                case 3:
                    i10 = 8;
                    break;
                case 4:
                    i10 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 = 5;
                    break;
                case 6:
                    i10 = 2;
                    break;
                case 11:
                    i10 = 10;
                    break;
                case 12:
                default:
                    i10 = 3;
                    break;
                case 13:
                    break;
            }
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, i10, cVar.a);
    }

    public static void i(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void j(Notification.Builder builder, int i10) {
        builder.setGroupAlertBehavior(i10);
    }

    public static void k(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void l(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void m(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
