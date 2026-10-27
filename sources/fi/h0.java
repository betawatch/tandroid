package fi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.is0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h0 implements ng.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // ng.e
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
                of0 of0Var = ((pf0) frameLayout).a;
                if (of0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((is0) of0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0();
        }
    }

    @Override // ng.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((pf0) this.b).b.o();
                break;
        }
    }

    @Override // ng.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((pf0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // ng.e
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
                of0 of0Var = ((pf0) frameLayout).a;
                if (of0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((is0) of0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override // ng.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((pf0) this.b).b.k();
                break;
        }
    }

    @Override // ng.e
    public final void f(float f7) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f7);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f7);
                break;
            default:
                pf0 pf0Var = (pf0) this.b;
                pf0Var.b.setRotation(f7);
                pf0Var.getClass();
                of0 of0Var = pf0Var.a;
                if (of0Var != null) {
                    ((is0) of0Var).d(false);
                    break;
                }
                break;
        }
    }
}
