// default package

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import org.telegram.tgnet.TLObject;
import org.webrtc.GlUtil;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ojc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ ojc(rjc rjcVar, byte b) {
        this.a = b;
        this.b = rjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        float f;
        float f2;
        float f3;
        EGLSurface eGLSurface;
        byte b = this.a;
        rjc rjcVar = this.b;
        switch (b) {
            case 0:
                synchronized (rjcVar.y) {
                    VideoFrame videoFrame = rjcVar.E;
                    if (videoFrame == null) {
                        return;
                    }
                    rjcVar.E = null;
                    njc njcVar = rjcVar.r;
                    if (njcVar == null || !njcVar.hasSurface()) {
                        rjcVar.c("Dropping frame - No surface");
                        return;
                    }
                    synchronized (rjcVar.f) {
                        long j = rjcVar.n;
                        if (j != Long.MAX_VALUE) {
                            if (j > 0) {
                                long nanoTime = System.nanoTime();
                                long j2 = rjcVar.h;
                                if (nanoTime >= j2) {
                                    long j3 = j2 + rjcVar.n;
                                    rjcVar.h = j3;
                                    rjcVar.h = Math.max(j3, nanoTime);
                                }
                            }
                            z = true;
                        }
                        z = false;
                    }
                    System.nanoTime();
                    boolean z2 = Math.abs(rjcVar.I) == 90 || Math.abs(rjcVar.I) == 270;
                    float rotatedHeight = (z2 ? videoFrame.getRotatedHeight() : videoFrame.getRotatedWidth()) / (z2 ? videoFrame.getRotatedWidth() : videoFrame.getRotatedHeight());
                    synchronized (rjcVar.F) {
                        f = rjcVar.G;
                        if (f == 0.0f) {
                            f = rotatedHeight;
                        }
                    }
                    if (rotatedHeight > f) {
                        f3 = f / rotatedHeight;
                        f2 = 1.0f;
                    } else {
                        f2 = rotatedHeight / f;
                        f3 = 1.0f;
                    }
                    rjcVar.x.reset();
                    rjcVar.x.preTranslate(0.5f, 0.5f);
                    rjcVar.x.preRotate(rjcVar.I);
                    rjcVar.x.preScale(rjcVar.H ? -1.0f : 1.0f, 1.0f);
                    rjcVar.x.preScale(f3, f2);
                    rjcVar.x.preTranslate(-0.5f, -0.5f);
                    if (z) {
                        try {
                            try {
                                rjcVar.s.a(videoFrame, rjcVar.w, rjcVar.x, rjcVar.r.surfaceWidth(), rjcVar.r.surfaceHeight(), z2, false);
                                njc njcVar2 = rjcVar.r;
                                EGLSurface eGLSurface2 = njcVar2.e;
                                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                                    njcVar2.c(eGLSurface2);
                                    rjcVar.s.a(videoFrame, rjcVar.w, rjcVar.x, rjcVar.r.surfaceWidth(), rjcVar.r.surfaceHeight(), z2, true);
                                    rjcVar.r.e(true);
                                    rjcVar.r.makeCurrent();
                                }
                                System.nanoTime();
                                rjcVar.r.e(false);
                                if (!rjcVar.a) {
                                    rjcVar.a = true;
                                    hl.c3(new s8b((anb) rjcVar, (byte) 19));
                                }
                            } catch (GlUtil.GlOutOfMemoryException e) {
                                Logging.e("VoIPEglRenderer", rjcVar.b + "Error while drawing frame", e);
                                rjcVar.w.d();
                                nmc nmcVar = rjcVar.s;
                                mmc mmcVar = nmcVar.d;
                                mmcVar.a = null;
                                int[] iArr = mmcVar.b;
                                if (iArr != null) {
                                    GLES20.glDeleteTextures(3, iArr, 0);
                                    mmcVar.b = null;
                                }
                                nmcVar.e = null;
                                rjcVar.J.release();
                            }
                        } finally {
                            videoFrame.release();
                        }
                    }
                    rjcVar.d(z);
                    return;
                }
            default:
                njc njcVar3 = rjcVar.r;
                if (njcVar3 != null && njcVar3.hasSurface()) {
                    rjcVar.c("clearSurface");
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(TLObject.FLAG_14);
                    rjcVar.r.e(false);
                }
                njc njcVar4 = rjcVar.r;
                if (njcVar4 == null || (eGLSurface = njcVar4.e) == EGL14.EGL_NO_SURFACE) {
                    return;
                }
                njcVar4.c(eGLSurface);
                rjcVar.c("clearSurface in background");
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(TLObject.FLAG_14);
                rjcVar.r.e(true);
                rjcVar.r.makeCurrent();
                return;
        }
    }
}
