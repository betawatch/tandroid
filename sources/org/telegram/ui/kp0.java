package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kp0 extends org.telegram.ui.Components.t51 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ org.telegram.messenger.ls n0;

    public /* synthetic */ kp0(org.telegram.messenger.ls lsVar, int i7) {
        this.m0 = i7;
        this.n0 = lsVar;
    }

    @Override // org.telegram.ui.Components.t51
    public final void g0() {
        switch (this.m0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                if (photoViewer.t4 == 0) {
                    PhotoViewer.Q(photoViewer, false);
                }
                if (!photoViewer.N8) {
                    d1.f.D(S());
                    d1.f.x(false);
                    break;
                }
                break;
            default:
                super.g0();
                ((SecretMediaViewer) this.n0).U.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t51
    public final void h0() {
        switch (this.m0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                PhotoViewer.Q(photoViewer, true);
                if (!photoViewer.N8) {
                    d1.f.D(S());
                    d1.f.x(true);
                    break;
                }
                break;
            default:
                super.h0();
                ((SecretMediaViewer) this.n0).U.a(true, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t51, e2.a1
    public void onRenderedFirstFrame() {
        e2.w0 j3;
        switch (this.m0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                boolean z9 = true;
                photoViewer.R = true;
                if (photoViewer.D2) {
                    photoViewer.e0.invalidate();
                }
                photoViewer.x3();
                if (!d1.f.u() && !photoViewer.r) {
                    z9 = false;
                }
                t0(z9);
                if (!photoViewer.N8) {
                    d1.f.D(S());
                    l2.i0 i0Var = this.d;
                    float f10 = 1.0f;
                    if (i0Var != null && (j3 = i0Var.j()) != null) {
                        f10 = j3.a;
                    }
                    d1.f.z(f10);
                    break;
                }
                break;
            default:
                super.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.ui.Components.t51
    public void p0(long j3) {
        switch (this.m0) {
            case 0:
                q0(j3, false);
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                if (photoViewer.r1) {
                    PhotoViewer.R(photoViewer, j3);
                }
                if (!photoViewer.N8) {
                    d1.f.D(j3);
                    break;
                }
                break;
            default:
                super.p0(j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t51
    public void u0(boolean z9) {
        switch (this.m0) {
            case 1:
                super.u0(z9);
                ((SecretMediaViewer) this.n0).U.a(z9, true);
                break;
            default:
                super.u0(z9);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t51
    public void v0(float f10) {
        switch (this.m0) {
            case 0:
                super.v0(f10);
                if (!((PhotoViewer) this.n0).N8) {
                    d1.f.z(f10);
                    break;
                }
                break;
            default:
                super.v0(f10);
                break;
        }
    }
}
