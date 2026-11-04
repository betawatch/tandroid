package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.Components.m51 {
    public final /* synthetic */ int n0;
    public final /* synthetic */ org.telegram.messenger.cs o0;

    public /* synthetic */ bp0(org.telegram.messenger.cs csVar, int i3) {
        this.n0 = i3;
        this.o0 = csVar;
    }

    @Override // org.telegram.ui.Components.m51
    public final void g0() {
        switch (this.n0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.v4 == 0) {
                    PhotoViewer.Z(photoViewer, false);
                }
                if (!photoViewer.P8) {
                    d1.f.D(S());
                    d1.f.x(false);
                    break;
                }
                break;
            default:
                super.g0();
                ((SecretMediaViewer) this.o0).V.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m51
    public final void h0() {
        switch (this.n0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                PhotoViewer.Z(photoViewer, true);
                if (!photoViewer.P8) {
                    d1.f.D(S());
                    d1.f.x(true);
                    break;
                }
                break;
            default:
                super.h0();
                ((SecretMediaViewer) this.o0).V.a(true, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m51, d2.c1
    public void onRenderedFirstFrame() {
        d2.y0 g7;
        switch (this.n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                boolean z10 = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f0.invalidate();
                }
                photoViewer.C3();
                if (!d1.f.u() && !photoViewer.r) {
                    z10 = false;
                }
                t0(z10);
                if (!photoViewer.P8) {
                    d1.f.D(S());
                    k2.i0 i0Var = this.d;
                    float f10 = 1.0f;
                    if (i0Var != null && (g7 = i0Var.g()) != null) {
                        f10 = g7.a;
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

    @Override // org.telegram.ui.Components.m51
    public void p0(long j10) {
        switch (this.n0) {
            case 0:
                q0(j10, false);
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.s1) {
                    PhotoViewer.a0(photoViewer, j10);
                }
                if (!photoViewer.P8) {
                    d1.f.D(j10);
                    break;
                }
                break;
            default:
                super.p0(j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m51
    public void u0(boolean z10) {
        switch (this.n0) {
            case 1:
                super.u0(z10);
                ((SecretMediaViewer) this.o0).V.a(z10, true);
                break;
            default:
                super.u0(z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m51
    public void v0(float f10) {
        switch (this.n0) {
            case 0:
                super.v0(f10);
                if (!((PhotoViewer) this.o0).P8) {
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
