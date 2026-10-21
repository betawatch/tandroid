package ei;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zr0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class h0 implements mg.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // mg.e
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
                nf0 nf0Var = ((of0) frameLayout).a;
                if (nf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((zr0) nf0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0();
        }
    }

    @Override // mg.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((of0) this.b).b.o();
                break;
        }
    }

    @Override // mg.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((of0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // mg.e
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
                nf0 nf0Var = ((of0) frameLayout).a;
                if (nf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((zr0) nf0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.Q0(-90.0f, false, null);
        }
    }

    @Override // mg.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((of0) this.b).b.k();
                break;
        }
    }

    @Override // mg.e
    public final void f(float f7) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f7);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f7);
                break;
            default:
                of0 of0Var = (of0) this.b;
                of0Var.b.setRotation(f7);
                of0Var.getClass();
                nf0 nf0Var = of0Var.a;
                if (nf0Var != null) {
                    ((zr0) nf0Var).a(false);
                    break;
                }
                break;
        }
    }
}
