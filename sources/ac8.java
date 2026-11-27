// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ac8 extends kfc {
    public final /* synthetic */ byte n0;
    public final /* synthetic */ fn7 o0;

    public /* synthetic */ ac8(fn7 fn7Var, byte b) {
        this.n0 = b;
        this.o0 = fn7Var;
    }

    @Override // kfc
    public final void f0() {
        byte b = this.n0;
        fn7 fn7Var = this.o0;
        switch (b) {
            case 0:
                super.f0();
                PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                if (photoViewer.t4 == 0) {
                    photoViewer.q1(false);
                }
                if (!photoViewer.T8) {
                    go.F(S());
                    go.z(false);
                    break;
                }
                break;
            default:
                super.f0();
                ((SecretMediaViewer) fn7Var).V.a(false, true);
                break;
        }
    }

    @Override // kfc
    public final void g0() {
        byte b = this.n0;
        fn7 fn7Var = this.o0;
        switch (b) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.q1(true);
                if (!photoViewer.T8) {
                    go.F(S());
                    go.z(true);
                    break;
                }
                break;
            default:
                super.g0();
                ((SecretMediaViewer) fn7Var).V.a(true, true);
                break;
        }
    }

    @Override // kfc
    public final void o0(long j) {
        switch (this.n0) {
            case 0:
                p0(j, false);
                PhotoViewer photoViewer = (PhotoViewer) this.o0;
                if (photoViewer.s1) {
                    photoViewer.B1(j);
                }
                if (!photoViewer.T8) {
                    go.F(j);
                    break;
                }
                break;
            default:
                super.o0(j);
                break;
        }
    }

    @Override // kfc, bg8
    public final void onRenderedFirstFrame() {
        of8 f;
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
                if (!go.w() && !photoViewer.r) {
                    z = false;
                }
                s0(z);
                if (!photoViewer.T8) {
                    go.F(S());
                    s64 s64Var = this.d;
                    float f2 = 1.0f;
                    if (s64Var != null && (f = s64Var.f()) != null) {
                        f2 = f.a;
                    }
                    go.B(f2);
                    break;
                }
                break;
            default:
                super.onRenderedFirstFrame();
                break;
        }
    }

    @Override // kfc
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

    @Override // kfc
    public final void u0(float f) {
        switch (this.n0) {
            case 0:
                super.u0(f);
                if (!((PhotoViewer) this.o0).T8) {
                    go.B(f);
                    break;
                }
                break;
            default:
                super.u0(f);
                break;
        }
    }
}
