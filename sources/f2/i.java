package f2;

import android.app.RemoteInput;
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
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class i {
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

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean c(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i7 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i7 == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager d(Context context) {
        synchronized (i.class) {
            synchronized (i.class) {
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
                        h2.i iVar = new h2.i();
                        h2.a.e().execute(new h(0, (Object) applicationContext, (Object) iVar));
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0025, code lost:
    
        if (r0 == Integer.MIN_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(AudioManager audioManager, g gVar) {
        int volumeControlStream;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Object obj = gVar.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = gVar.b;
        e2.e eVar = gVar.d;
        eVar.getClass();
        if (i7 >= 26) {
            try {
                volumeControlStream = eVar.b().getVolumeControlStream();
            } catch (RuntimeException unused) {
            }
        } else {
            if ((eVar.b & 1) != 1) {
                switch (eVar.c) {
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

    public static void f(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void g(MenuItem menuItem, char c10, int i7) {
        menuItem.setAlphabeticShortcut(c10, i7);
    }

    public static void h(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void i(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void j(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void k(MenuItem menuItem, char c10, int i7) {
        menuItem.setNumericShortcut(c10, i7);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
