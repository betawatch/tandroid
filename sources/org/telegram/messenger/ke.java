package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ke implements g61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gj c;
    public final /* synthetic */ MediaController d;

    public /* synthetic */ ke(MediaController mediaController, int i7, gj gjVar, int i10) {
        this.a = i10;
        this.d = mediaController;
        this.b = i7;
        this.c = gjVar;
    }

    @Override // org.telegram.ui.Components.g61
    public final void onError(i61 i61Var, Exception exc) {
        switch (this.a) {
            case 0:
                break;
            default:
                a8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public final /* synthetic */ void onSeekFinished(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public final /* synthetic */ void onSeekStarted(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public final void onStateChanged(boolean z10, int i7) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i11 == mediaController.n0) {
                    gj gjVar = this.c;
                    if (i7 == 4 || ((i7 == 1 || i7 == 2) && z10 && gjVar.b0 >= 0.999f)) {
                        gjVar.b0 = 1.0f;
                        ls.f(gjVar.K1).k(ls.e2, Integer.valueOf(gjVar.e1()), 0);
                        if (!mediaController.a0()) {
                            if (arrayList.isEmpty() || (arrayList.size() <= 1 && gj.R4(gjVar.k))) {
                                mediaController.q(true, mediaController.F(), gj.R4(gjVar.k), false);
                            } else {
                                mediaController.U(true);
                            }
                        }
                    } else {
                        if (mediaController.j0 != null && mediaController.u0 != 0.0f && (i7 == 3 || i7 == 1)) {
                            mediaController.j0.q0((int) (r10.U() * mediaController.u0), false);
                            mediaController.u0 = 0.0f;
                        }
                    }
                    if (mediaController.j0 != null && d1.f.u()) {
                        mediaController.j0.t0(true);
                        break;
                    }
                }
                break;
            default:
                MediaController mediaController2 = this.d;
                if (i11 == mediaController2.n0) {
                    MediaController.f(mediaController2, this.c, null, true, z10, i7);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.F0 == null) {
                    return false;
                }
                int i7 = mediaController.J0;
                if (i7 == 2) {
                    org.telegram.ui.j4 j4Var = mediaController.M0;
                    if (j4Var != null) {
                        if (mediaController.N0) {
                            j4Var.setDrawingReady(true);
                        }
                        if (mediaController.M0.getParent() == null) {
                            mediaController.O0.addView(mediaController.M0);
                        }
                        if (mediaController.H0.getSurfaceTexture() != surfaceTexture) {
                            mediaController.H0.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.F0.A0(mediaController.H0);
                    }
                    mediaController.J0 = 0;
                } else if (i7 == 1) {
                    if (mediaController.K0 != null) {
                        if (mediaController.I0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.I0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.K0, new a(this, 16));
                            } catch (Exception unused) {
                                mediaController.I0 = null;
                            }
                        }
                        PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                        if (pipRoundVideoView2 != null) {
                            if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                                mediaController.I0.c.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.F0.A0(mediaController.I0.c);
                        }
                    }
                    mediaController.J0 = 0;
                } else {
                    if (!PhotoViewer.A1() || PhotoViewer.p1().S2 == null) {
                        return false;
                    }
                    PhotoViewer.p1().T2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.g61
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                break;
            default:
                float f11 = i10 == 0 ? 1.0f : (i7 * f10) / i10;
                MediaController mediaController = this.d;
                mediaController.P0 = f11;
                org.telegram.ui.j4 j4Var = mediaController.M0;
                if (j4Var != null) {
                    j4Var.a(f11, 0);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g61
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.j4 j4Var = mediaController.M0;
                if (j4Var != null && !j4Var.d) {
                    mediaController.N0 = true;
                    j4Var.setDrawingReady(true);
                    mediaController.O0.setTag(1);
                    break;
                }
                break;
        }
    }

    private final void b() {
    }

    private final /* synthetic */ void c(m2.a aVar) {
    }

    private final /* synthetic */ void d(m2.a aVar) {
    }

    private final /* synthetic */ void e(m2.a aVar) {
    }

    private final /* synthetic */ void f(m2.a aVar) {
    }

    private final /* synthetic */ void g(m2.a aVar) {
    }

    private final /* synthetic */ void h(m2.a aVar) {
    }

    private final /* synthetic */ void i(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void j(SurfaceTexture surfaceTexture) {
    }

    private final void a(i61 i61Var, Exception exc) {
    }

    private final void k(int i7, int i10, float f10, int i11) {
    }
}
