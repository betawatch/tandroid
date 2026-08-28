package b5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import d5.f0;
import h3.t0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public l d;

    public m(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static m f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return null;
        }
        return new m(audioManager.getSpatializer());
    }

    public final boolean a(t0 t0Var, j3.e eVar) {
        String str = t0Var.B;
        int i9 = t0Var.O;
        if ("audio/eac3-joc".equals(str) && i9 == 16) {
            i9 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(f0.m(i9));
        int i10 = t0Var.P;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.a.canBeSpatialized((AudioAttributes) eVar.a().b, channelMask.build());
    }

    public final void b(r rVar, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new l(rVar);
            Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new c2.f(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.a.isAvailable();
    }

    public final boolean d() {
        return this.a.isEnabled();
    }

    public final void e() {
        l lVar = this.d;
        if (lVar == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(lVar);
        Handler handler = this.c;
        int i9 = f0.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }
}
