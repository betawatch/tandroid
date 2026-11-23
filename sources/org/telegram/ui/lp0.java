package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.Components.i61 {
    public final /* synthetic */ int n0;
    public final /* synthetic */ org.telegram.messenger.gs o0;

    public /* synthetic */ lp0(org.telegram.messenger.gs gsVar, int i7) {
        this.n0 = i7;
        this.o0 = gsVar;
    }

    @Override // org.telegram.ui.Components.i61
    public final void g0() {
        switch (this.n0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.u4 == 0) {
                    PhotoViewer.R(photoViewer, false);
                }
                if (!photoViewer.O8) {
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

    @Override // org.telegram.ui.Components.i61
    public final void h0() {
        switch (this.n0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                PhotoViewer.R(photoViewer, true);
                if (!photoViewer.O8) {
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

    @Override // org.telegram.ui.Components.i61, e2.a1
    public void onRenderedFirstFrame() {
        e2.w0 j3;
        switch (this.n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                boolean z10 = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f0.invalidate();
                }
                photoViewer.y3();
                if (!d1.f.u() && !photoViewer.r) {
                    z10 = false;
                }
                t0(z10);
                if (!photoViewer.O8) {
                    d1.f.D(S());
                    l2.f0 f0Var = this.d;
                    float f10 = 1.0f;
                    if (f0Var != null && (j3 = f0Var.j()) != null) {
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

    @Override // org.telegram.ui.Components.i61
    public void p0(long j3) {
        switch (this.n0) {
            case 0:
                q0(j3, false);
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.s1) {
                    PhotoViewer.S(photoViewer, j3);
                }
                if (!photoViewer.O8) {
                    d1.f.D(j3);
                    break;
                }
                break;
            default:
                super.p0(j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i61
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

    @Override // org.telegram.ui.Components.i61
    public void v0(float f10) {
        switch (this.n0) {
            case 0:
                super.v0(f10);
                if (!((PhotoViewer) this.o0).O8) {
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
