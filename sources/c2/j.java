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
import bi.f2;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class j {
    public static AudioManager a;

    public static void a(AudioManager audioManager, h hVar) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(hVar.b);
            return;
        }
        Object obj = hVar.f;
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
        for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (j.class) {
            synchronized (j.class) {
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
                        e2.i iVar = new e2.i();
                        e2.a.e().execute(new f2(19, applicationContext, iVar));
                        iVar.b();
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0025, code lost:
    
        if (r0 == Integer.MIN_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(AudioManager audioManager, h hVar) {
        int volumeControlStream;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Object obj = hVar.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = hVar.b;
        b2.f fVar = hVar.d;
        fVar.getClass();
        if (i10 >= 26) {
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
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, volumeControlStream, hVar.a);
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

    public static void m(Notification.Builder builder, long j10) {
        builder.setTimeoutAfter(j10);
    }
}
