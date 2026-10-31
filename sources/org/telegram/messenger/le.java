package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class le implements s61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jj c;
    public final /* synthetic */ MediaController d;

    public /* synthetic */ le(MediaController mediaController, int i10, jj jjVar, int i11) {
        this.a = i11;
        this.d = mediaController;
        this.b = i10;
        this.c = jjVar;
    }

    @Override // org.telegram.ui.Components.s61
    public final void onError(u61 u61Var, Exception exc) {
        switch (this.a) {
            case 0:
                break;
            default:
                f8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.s61
    public final /* synthetic */ void onSeekFinished(j2.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.s61
    public final /* synthetic */ void onSeekStarted(j2.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.s61
    public final void onStateChanged(boolean z10, int i10) {
        int i11 = this.a;
        int i12 = this.b;
        switch (i11) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.R0;
                if (i12 == mediaController.m0) {
                    jj jjVar = this.c;
                    if (i10 == 4 || ((i10 == 1 || i10 == 2) && z10 && jjVar.b0 >= 0.999f)) {
                        jjVar.b0 = 1.0f;
                        zs.f(jjVar.I1).k(zs.e2, Integer.valueOf(jjVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (arrayList.isEmpty() || (arrayList.size() <= 1 && jj.R4(jjVar.k))) {
                                mediaController.q(true, mediaController.F(), jj.R4(jjVar.k), false);
                            } else {
                                mediaController.U(true);
                            }
                        }
                    } else {
                        if (mediaController.i0 != null && mediaController.t0 != 0.0f && (i10 == 3 || i10 == 1)) {
                            mediaController.i0.q0((int) (r10.U() * mediaController.t0), false);
                            mediaController.t0 = 0.0f;
                        }
                    }
                    if (mediaController.i0 != null && b5.d.u()) {
                        mediaController.i0.t0(true);
                        break;
                    }
                }
                break;
            default:
                MediaController mediaController2 = this.d;
                if (i12 == mediaController2.m0) {
                    MediaController.f(mediaController2, this.c, null, true, z10, i10);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.E0 == null) {
                    return false;
                }
                int i10 = mediaController.I0;
                if (i10 == 2) {
                    org.telegram.ui.k4 k4Var = mediaController.L0;
                    if (k4Var != null) {
                        if (mediaController.M0) {
                            k4Var.setDrawingReady(true);
                        }
                        if (mediaController.L0.getParent() == null) {
                            mediaController.N0.addView(mediaController.L0);
                        }
                        if (mediaController.G0.getSurfaceTexture() != surfaceTexture) {
                            mediaController.G0.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.E0.A0(mediaController.G0);
                    }
                    mediaController.I0 = 0;
                } else if (i10 == 1) {
                    if (mediaController.J0 != null) {
                        if (mediaController.H0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.H0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.J0, new a(this, 15));
                            } catch (Exception unused) {
                                mediaController.H0 = null;
                            }
                        }
                        PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                        if (pipRoundVideoView2 != null) {
                            if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.H0.c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.E0.A0(mediaController.H0.c);
                        }
                    }
                    mediaController.I0 = 0;
                } else {
                    if (!PhotoViewer.F1() || PhotoViewer.v1().S2 == null) {
                        return false;
                    }
                    PhotoViewer.v1().T2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.s61
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        switch (this.a) {
            case 0:
                break;
            default:
                float f10 = i11 == 0 ? 1.0f : (i10 * f7) / i11;
                MediaController mediaController = this.d;
                mediaController.O0 = f10;
                org.telegram.ui.k4 k4Var = mediaController.L0;
                if (k4Var != null) {
                    k4Var.a(f10, 0);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.k4 k4Var = mediaController.L0;
                if (k4Var != null && !k4Var.d) {
                    mediaController.M0 = true;
                    k4Var.setDrawingReady(true);
                    mediaController.N0.setTag(1);
                    break;
                }
                break;
        }
    }

    private final void b() {
    }

    private final /* synthetic */ void c(j2.a aVar) {
    }

    private final /* synthetic */ void d(j2.a aVar) {
    }

    private final /* synthetic */ void e(j2.a aVar) {
    }

    private final /* synthetic */ void f(j2.a aVar) {
    }

    private final /* synthetic */ void g(j2.a aVar) {
    }

    private final /* synthetic */ void h(j2.a aVar) {
    }

    private final /* synthetic */ void i(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void j(SurfaceTexture surfaceTexture) {
    }

    private final void a(u61 u61Var, Exception exc) {
    }

    private final void k(int i10, int i11, float f7, int i12) {
    }
}
