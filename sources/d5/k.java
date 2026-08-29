package d5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import f5.d0;
import j3.t0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public j d;

    public k(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static k f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return null;
        }
        return new k(audioManager.getSpatializer());
    }

    public final boolean a(t0 t0Var, l3.e eVar) {
        String str = t0Var.B;
        int i10 = t0Var.O;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(d0.m(i10));
        int i11 = t0Var.P;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.a.canBeSpatialized((AudioAttributes) eVar.a().b, channelMask.build());
    }

    public final void b(p pVar, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new j(pVar);
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
        j jVar = this.d;
        if (jVar == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(jVar);
        Handler handler = this.c;
        int i10 = d0.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }
}
