package b5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import d5.g0;
import h3.t0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public k d;

    public l(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static l f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return null;
        }
        return new l(audioManager.getSpatializer());
    }

    public final boolean a(t0 t0Var, j3.e eVar) {
        String str = t0Var.B;
        int i10 = t0Var.O;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(g0.m(i10));
        int i11 = t0Var.P;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.a.canBeSpatialized((AudioAttributes) eVar.a().b, channelMask.build());
    }

    public final void b(q qVar, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new k(qVar);
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
        k kVar = this.d;
        if (kVar == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(kVar);
        Handler handler = this.c;
        int i10 = g0.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }
}
