package ei;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bs0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                mf0 mf0Var = ((nf0) frameLayout).a;
                if (mf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((bs0) mf0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0();
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
                ((nf0) this.b).b.o();
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
                ((nf0) this.b).b.a.g(1, true);
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
                mf0 mf0Var = ((nf0) frameLayout).a;
                if (mf0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((bs0) mf0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
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
                ((nf0) this.b).b.k();
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
                nf0 nf0Var = (nf0) this.b;
                nf0Var.b.setRotation(f7);
                nf0Var.getClass();
                mf0 mf0Var = nf0Var.a;
                if (mf0Var != null) {
                    ((bs0) mf0Var).a(false);
                    break;
                }
                break;
        }
    }
}
