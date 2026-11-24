// default package

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nn6 implements ldc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k47 c;
    public final /* synthetic */ MediaController d;

    public /* synthetic */ nn6(MediaController mediaController, int i, k47 k47Var, byte b) {
        this.a = b;
        this.d = mediaController;
        this.b = i;
        this.c = k47Var;
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
        switch (this.a) {
            case 0:
                break;
            default:
                fc4.g(exc, true);
                break;
        }
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                MediaController mediaController = this.d;
                jy jyVar = mediaController.M0;
                if (jyVar != null && !jyVar.d) {
                    mediaController.N0 = true;
                    jyVar.setDrawingReady(true);
                    mediaController.O0.setTag(1);
                    break;
                }
                break;
        }
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
        byte b = this.a;
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
        byte b = this.a;
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i2 == mediaController.n0) {
                    k47 k47Var = this.c;
                    if (i == 4 || ((i == 1 || i == 2) && z && k47Var.b0 >= 0.999f)) {
                        k47Var.b0 = 1.0f;
                        nm7.f(k47Var.K1).k(nm7.e2, Integer.valueOf(k47Var.e1()), 0);
                        if (!mediaController.Z()) {
                            if (arrayList.isEmpty() || (arrayList.size() <= 1 && k47.Q4(k47Var.k))) {
                                mediaController.l(true, mediaController.A(), k47.Q4(k47Var.k), false);
                            } else {
                                mediaController.T(true);
                            }
                        }
                    } else {
                        if (mediaController.j0 != null && mediaController.u0 != 0.0f && (i == 3 || i == 1)) {
                            mediaController.j0.p0((int) (r8.U() * mediaController.u0), false);
                            mediaController.u0 = 0.0f;
                        }
                    }
                    if (mediaController.j0 != null && fp.w()) {
                        mediaController.j0.s0(true);
                        break;
                    }
                }
                break;
            default:
                MediaController mediaController2 = this.d;
                if (i2 == mediaController2.n0) {
                    mediaController2.G0(this.c, null, true, z, i);
                    break;
                }
                break;
        }
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                break;
            default:
                MediaController mediaController = this.d;
                if (mediaController.F0 != null) {
                    byte b = mediaController.J0;
                    if (b == 2) {
                        jy jyVar = mediaController.M0;
                        if (jyVar != null) {
                            if (mediaController.N0) {
                                jyVar.setDrawingReady(true);
                            }
                            if (mediaController.M0.getParent() == null) {
                                mediaController.O0.addView(mediaController.M0);
                            }
                            if (mediaController.H0.getSurfaceTexture() != surfaceTexture) {
                                mediaController.H0.setSurfaceTexture(surfaceTexture);
                            }
                            mediaController.F0.z0(mediaController.H0);
                        }
                        mediaController.J0 = (byte) 0;
                    } else if (b == 1) {
                        if (mediaController.K0 != null) {
                            if (mediaController.I0 == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                                    mediaController.I0 = pipRoundVideoView;
                                    pipRoundVideoView.d(mediaController.K0, new pg6(this, (byte) 6));
                                } catch (Exception unused) {
                                    mediaController.I0 = null;
                                }
                            }
                            PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                            if (pipRoundVideoView2 != null) {
                                if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                                    mediaController.I0.c.setSurfaceTexture(surfaceTexture);
                                }
                                mediaController.F0.z0(mediaController.I0.c);
                            }
                        }
                        mediaController.J0 = (byte) 0;
                    } else if (PhotoViewer.C0() && PhotoViewer.r0().S2 != null) {
                        PhotoViewer.r0().T2 = surfaceTexture;
                    }
                    break;
                }
                break;
        }
        return false;
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        byte b = this.a;
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        switch (this.a) {
            case 0:
                break;
            default:
                float f2 = i2 == 0 ? 1.0f : (i * f) / i2;
                MediaController mediaController = this.d;
                mediaController.P0 = f2;
                jy jyVar = mediaController.M0;
                if (jyVar != null) {
                    jyVar.a(f2, 0);
                    break;
                }
                break;
        }
    }

    private final void b() {
    }

    private final void c(tk tkVar) {
    }

    private final void d(tk tkVar) {
    }

    private final void e(tk tkVar) {
    }

    private final void f(tk tkVar) {
    }

    private final void g(tk tkVar) {
    }

    private final void h(tk tkVar) {
    }

    private final void i(SurfaceTexture surfaceTexture) {
    }

    private final void j(SurfaceTexture surfaceTexture) {
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
        byte b = this.a;
    }

    private final void a(ndc ndcVar, Exception exc) {
    }

    private final void k(int i, int i2, float f, int i3) {
    }
}
