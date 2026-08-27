package lh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rr0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h0 implements uf.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // uf.d
    public final boolean a() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                fe0 fe0Var = ((ge0) frameLayout).a;
                if (fe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((rr0) fe0Var).a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.N0();
        }
    }

    @Override // uf.d
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((ge0) this.b).b.o();
                break;
        }
    }

    @Override // uf.d
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((ge0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // uf.d
    public final boolean d() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                g0 g0Var = j0Var.f;
                boolean m10 = g0Var.m(-90.0f);
                g0Var.i();
                j0Var.d.invalidate();
                return m10;
            case 1:
                m0 m0Var = (m0) frameLayout;
                g0 g0Var2 = m0Var.h;
                boolean m11 = g0Var2.m(-90.0f);
                g0Var2.i();
                m0Var.e.invalidate();
                return m11;
            default:
                fe0 fe0Var = ((ge0) frameLayout).a;
                if (fe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((rr0) fe0Var).a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override // uf.d
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((ge0) this.b).b.k();
                break;
        }
    }

    @Override // uf.d
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f10);
                break;
            default:
                ge0 ge0Var = (ge0) this.b;
                ge0Var.b.setRotation(f10);
                ge0Var.getClass();
                fe0 fe0Var = ge0Var.a;
                if (fe0Var != null) {
                    ((rr0) fe0Var).a(false);
                    break;
                }
                break;
        }
    }
}
