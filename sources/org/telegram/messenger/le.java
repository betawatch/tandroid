package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class le implements l51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ij c;
    public final /* synthetic */ MediaController d;

    public /* synthetic */ le(MediaController mediaController, int i7, ij ijVar, int i10) {
        this.a = i10;
        this.d = mediaController;
        this.b = i7;
        this.c = ijVar;
    }

    @Override // org.telegram.ui.Components.l51
    public final void onError(n51 n51Var, Exception exc) {
        switch (this.a) {
            case 0:
                break;
            default:
                a8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onSeekFinished(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onSeekStarted(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.l51
    public final void onStateChanged(boolean z9, int i7) {
        int i10 = this.a;
        int i11 = this.b;
        switch (i10) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.R0;
                if (i11 == mediaController.m0) {
                    ij ijVar = this.c;
                    if (i7 == 4 || ((i7 == 1 || i7 == 2) && z9 && ijVar.b0 >= 0.999f)) {
                        ijVar.b0 = 1.0f;
                        qs.f(ijVar.I1).k(qs.e2, Integer.valueOf(ijVar.f1()), 0);
                        if (!mediaController.a0()) {
                            if (arrayList.isEmpty() || (arrayList.size() <= 1 && ij.S4(ijVar.k))) {
                                mediaController.q(true, mediaController.F(), ij.S4(ijVar.k), false);
                            } else {
                                mediaController.U(true);
                            }
                        }
                    } else {
                        if (mediaController.i0 != null && mediaController.t0 != 0.0f && (i7 == 3 || i7 == 1)) {
                            mediaController.i0.q0((int) (r10.U() * mediaController.t0), false);
                            mediaController.t0 = 0.0f;
                        }
                    }
                    if (mediaController.i0 != null && d1.f.u()) {
                        mediaController.i0.t0(true);
                        break;
                    }
                }
                break;
            default:
                MediaController mediaController2 = this.d;
                if (i11 == mediaController2.m0) {
                    MediaController.f(mediaController2, this.c, null, true, z9, i7);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                return false;
            default:
                MediaController mediaController = this.d;
                if (mediaController.E0 == null) {
                    return false;
                }
                int i7 = mediaController.I0;
                if (i7 == 2) {
                    org.telegram.ui.j4 j4Var = mediaController.L0;
                    if (j4Var != null) {
                        if (mediaController.M0) {
                            j4Var.setDrawingReady(true);
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
                } else if (i7 == 1) {
                    if (mediaController.J0 != null) {
                        if (mediaController.H0 == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                mediaController.H0 = pipRoundVideoView;
                                pipRoundVideoView.d(mediaController.J0, new a(this, 16));
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
                    if (!PhotoViewer.A1() || PhotoViewer.p1().R2 == null) {
                        return false;
                    }
                    PhotoViewer.p1().S2 = surfaceTexture;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.l51
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        switch (this.a) {
            case 0:
                break;
            default:
                float f11 = i10 == 0 ? 1.0f : (i7 * f10) / i10;
                MediaController mediaController = this.d;
                mediaController.O0 = f11;
                org.telegram.ui.j4 j4Var = mediaController.L0;
                if (j4Var != null) {
                    j4Var.a(f11, 0);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                MediaController mediaController = this.d;
                org.telegram.ui.j4 j4Var = mediaController.L0;
                if (j4Var != null && !j4Var.d) {
                    mediaController.M0 = true;
                    j4Var.setDrawingReady(true);
                    mediaController.N0.setTag(1);
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

    private final void a(n51 n51Var, Exception exc) {
    }

    private final void k(int i7, int i10, float f10, int i11) {
    }
}
