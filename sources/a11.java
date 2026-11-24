// default package

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a11 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c11 b;

    public /* synthetic */ a11(c11 c11Var, byte b) {
        this.a = b;
        this.b = c11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        c11 c11Var = this.b;
        switch (b) {
            case 0:
                c11Var.u = true;
                c11Var.c.removeCallbacksAndMessages(null);
                MediaExtractor mediaExtractor = c11Var.n;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    c11Var.n = null;
                }
                c11Var.m = -1L;
                c11Var.r.clear();
                MediaCodec mediaCodec = c11Var.g;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Throwable unused) {
                    }
                    c11Var.g.release();
                    c11Var.g = null;
                }
                c11Var.h = null;
                SurfaceTextureHelper surfaceTextureHelper = c11Var.d;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    c11Var.d.dispose();
                    c11Var.d = null;
                }
                Surface surface = c11Var.e;
                if (surface != null) {
                    surface.release();
                    c11Var.e = null;
                }
                c11Var.b.quitSafely();
                return;
            case 1:
                try {
                    EglBase eglBase = VideoCapturerDevice.getEglBase();
                    SurfaceTextureHelper create = SurfaceTextureHelper.create("BroadcastTileTexture", eglBase != null ? eglBase.getEglBaseContext() : null);
                    c11Var.d = create;
                    if (create == null) {
                        throw new IllegalStateException("no SurfaceTextureHelper");
                    }
                    c11Var.e = new Surface(c11Var.d.getSurfaceTexture());
                    c11Var.d.startListening(new b11(c11Var, b2));
                    return;
                } catch (Throwable th) {
                    c11Var.v.b(c11Var.a, th);
                    return;
                }
            default:
                c11Var.t = false;
                if (c11Var.u || c11Var.e == null) {
                    return;
                }
                try {
                    c11Var.a();
                    if (c11Var.f.isEmpty() || c11Var.t || c11Var.u) {
                        return;
                    }
                    c11Var.t = true;
                    c11Var.c.postDelayed(new a11(c11Var, (byte) 2), 16L);
                    return;
                } catch (Throwable th2) {
                    c11Var.v.b(c11Var.a, th2);
                    return;
                }
        }
    }
}
