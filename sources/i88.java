// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i88 extends lbc {
    public final /* synthetic */ byte n0;
    public final /* synthetic */ gk7 o0;

    public /* synthetic */ i88(gk7 gk7Var, byte b) {
        this.n0 = b;
        this.o0 = gk7Var;
    }

    @Override // lbc
    public final void f0() {
        byte b = this.n0;
        gk7 gk7Var = this.o0;
        switch (b) {
            case 0:
                super.f0();
                PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                if (photoViewer.t4 == 0) {
                    photoViewer.q1(false);
                }
                if (!photoViewer.T8) {
                    fo.F(S());
                    fo.z(false);
                    break;
                }
                break;
            default:
                super.f0();
                ((SecretMediaViewer) gk7Var).V.a(false, true);
                break;
        }
    }

    @Override // lbc
    public final void g0() {
        byte b = this.n0;
        gk7 gk7Var = this.o0;
        switch (b) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.q1(true);
                if (!photoViewer.T8) {
                    fo.F(S());
                    fo.z(true);
                    break;
                }
                break;
            default:
                super.g0();
                ((SecretMediaViewer) gk7Var).V.a(true, true);
                break;
        }
    }

    @Override // lbc
    public final void o0(long j) {
        switch (this.n0) {
            case 0:
                p0(j, false);
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.s1) {
                    photoViewer.B1(j);
                }
                if (!photoViewer.T8) {
                    fo.F(j);
                    break;
                }
                break;
            default:
                super.o0(j);
                break;
        }
    }

    @Override // lbc, mc8
    public final void onRenderedFirstFrame() {
        zb8 g;
        switch (this.n0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                boolean z = true;
                photoViewer.S = true;
                if (photoViewer.E2) {
                    photoViewer.f0.invalidate();
                }
                photoViewer.N2();
                if (!fo.w() && !photoViewer.r) {
                    z = false;
                }
                s0(z);
                if (!photoViewer.T8) {
                    fo.F(S());
                    y54 y54Var = this.d;
                    float f = 1.0f;
                    if (y54Var != null && (g = y54Var.g()) != null) {
                        f = g.a;
                    }
                    fo.B(f);
                    break;
                }
                break;
            default:
                super.onRenderedFirstFrame();
                break;
        }
    }

    @Override // lbc
    public final void t0(boolean z) {
        switch (this.n0) {
            case 1:
                super.t0(z);
                ((SecretMediaViewer) this.o0).V.a(z, true);
                break;
            default:
                super.t0(z);
                break;
        }
    }

    @Override // lbc
    public final void u0(float f) {
        switch (this.n0) {
            case 0:
                super.u0(f);
                if (!((PhotoViewer) this.o0).T8) {
                    fo.B(f);
                    break;
                }
                break;
            default:
                super.u0(f);
                break;
        }
    }
}
