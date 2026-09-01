package f5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import h5.d0;
import j3.n0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public final boolean a(n0 n0Var, l3.d dVar) {
        String str = n0Var.C;
        int i10 = n0Var.P;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(d0.n(i10));
        int i11 = n0Var.Q;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.a.canBeSpatialized((AudioAttributes) dVar.a().b, channelMask.build());
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
