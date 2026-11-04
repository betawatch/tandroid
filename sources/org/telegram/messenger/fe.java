package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class fe implements k51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zi c;
    public final /* synthetic */ MediaController d;

    public /* synthetic */ fe(MediaController mediaController, int i3, zi ziVar, int i10) {
        this.a = i10;
        this.d = mediaController;
        this.b = i3;
        this.c = ziVar;
    }

    @Override // org.telegram.ui.Components.k51
    public final void onError(m51 m51Var, Exception exc) {
        switch (this.a) {
            case 0:
                break;
            default:
                a8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onSeekFinished(l2.a aVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onSeekStarted(l2.a aVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.k51
    public final void onStateChanged(boolean z10, int i3) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i11 == mediaController.n0) {
                    zi ziVar = this.c;
                    if (i3 == 4 || ((i3 == 1 || i3 == 2) && z10 && ziVar.b0 >= 0.999f)) {
                        ziVar.b0 = 1.0f;
                        hs.f(ziVar.I1).k(hs.e2, Integer.valueOf(ziVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (arrayList.isEmpty() || (arrayList.size() <= 1 && zi.S4(ziVar.k))) {
                                mediaController.q(true, mediaController.F(), zi.S4(ziVar.k), false);
                            } else {
                                mediaController.U(true);
                            }
                        }
                    } else {
                        if (mediaController.j0 != null && mediaController.u0 != 0.0f && (i3 == 3 || i3 == 1)) {
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
                    MediaController.f(mediaController2, this.c, null, true, z10, i3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.F0 == null) {
                    return false;
                }
                int i3 = mediaController.J0;
                if (i3 == 2) {
                    org.telegram.ui.l4 l4Var = mediaController.M0;
                    if (l4Var != null) {
                        if (mediaController.N0) {
                            l4Var.setDrawingReady(true);
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
                } else if (i3 == 1) {
                    if (mediaController.K0 != null) {
                        if (mediaController.I0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.I0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.K0, new a(this, 15));
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
                    if (!PhotoViewer.F1() || PhotoViewer.v1().T2 == null) {
                        return false;
                    }
                    PhotoViewer.v1().U2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.k51
    public final void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                break;
            default:
                float f11 = i10 == 0 ? 1.0f : (i3 * f10) / i10;
                MediaController mediaController = this.d;
                mediaController.P0 = f11;
                org.telegram.ui.l4 l4Var = mediaController.M0;
                if (l4Var != null) {
                    l4Var.a(f11, 0);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.l4 l4Var = mediaController.M0;
                if (l4Var != null && !l4Var.d) {
                    mediaController.N0 = true;
                    l4Var.setDrawingReady(true);
                    mediaController.O0.setTag(1);
                    break;
                }
                break;
        }
    }

    private final void b() {
    }

    private final /* synthetic */ void c(l2.a aVar) {
    }

    private final /* synthetic */ void d(l2.a aVar) {
    }

    private final /* synthetic */ void e(l2.a aVar) {
    }

    private final /* synthetic */ void f(l2.a aVar) {
    }

    private final /* synthetic */ void g(l2.a aVar) {
    }

    private final /* synthetic */ void h(l2.a aVar) {
    }

    private final /* synthetic */ void i(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void j(SurfaceTexture surfaceTexture) {
    }

    private final void a(m51 m51Var, Exception exc) {
    }

    private final void k(int i3, int i10, float f10, int i11) {
    }
}
