// default package

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class b01 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d01 b;

    public /* synthetic */ b01(d01 d01Var, byte b) {
        this.a = b;
        this.b = d01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        d01 d01Var = this.b;
        switch (b) {
            case 0:
                d01Var.u = true;
                d01Var.c.removeCallbacksAndMessages(null);
                MediaExtractor mediaExtractor = d01Var.n;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    d01Var.n = null;
                }
                d01Var.m = -1L;
                d01Var.r.clear();
                MediaCodec mediaCodec = d01Var.g;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Throwable unused) {
                    }
                    d01Var.g.release();
                    d01Var.g = null;
                }
                d01Var.h = null;
                SurfaceTextureHelper surfaceTextureHelper = d01Var.d;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    d01Var.d.dispose();
                    d01Var.d = null;
                }
                Surface surface = d01Var.e;
                if (surface != null) {
                    surface.release();
                    d01Var.e = null;
                }
                d01Var.b.quitSafely();
                return;
            case 1:
                try {
                    EglBase eglBase = VideoCapturerDevice.getEglBase();
                    SurfaceTextureHelper create = SurfaceTextureHelper.create("BroadcastTileTexture", eglBase != null ? eglBase.getEglBaseContext() : null);
                    d01Var.d = create;
                    if (create == null) {
                        throw new IllegalStateException("no SurfaceTextureHelper");
                    }
                    d01Var.e = new Surface(d01Var.d.getSurfaceTexture());
                    d01Var.d.startListening(new c01(d01Var, b2));
                    return;
                } catch (Throwable th) {
                    d01Var.v.b(d01Var.a, th);
                    return;
                }
            default:
                d01Var.t = false;
                if (d01Var.u || d01Var.e == null) {
                    return;
                }
                try {
                    d01Var.a();
                    if (d01Var.f.isEmpty() || d01Var.t || d01Var.u) {
                        return;
                    }
                    d01Var.t = true;
                    d01Var.c.postDelayed(new b01(d01Var, (byte) 2), 16L);
                    return;
                } catch (Throwable th2) {
                    d01Var.v.b(d01Var.a, th2);
                    return;
                }
        }
    }
}
