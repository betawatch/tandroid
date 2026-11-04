package gi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.io0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 implements pg.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i3, FrameLayout frameLayout) {
        this.a = i3;
        this.b = frameLayout;
    }

    @Override // pg.d
    public final boolean a() {
        int i3 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i3) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                zc0 zc0Var = ((ad0) frameLayout).a;
                if (zc0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((io0) zc0Var).a;
                Drawable[] drawableArr = PhotoViewer.V8;
                return photoViewer.O0();
        }
    }

    @Override // pg.d
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((ad0) this.b).b.o();
                break;
        }
    }

    @Override // pg.d
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((ad0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // pg.d
    public final boolean d() {
        int i3 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i3) {
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
                zc0 zc0Var = ((ad0) frameLayout).a;
                if (zc0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((io0) zc0Var).a;
                Drawable[] drawableArr = PhotoViewer.V8;
                return photoViewer.P0(-90.0f, false, null);
        }
    }

    @Override // pg.d
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((ad0) this.b).b.k();
                break;
        }
    }

    @Override // pg.d
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f10);
                break;
            default:
                ad0 ad0Var = (ad0) this.b;
                ad0Var.b.setRotation(f10);
                ad0Var.getClass();
                zc0 zc0Var = ad0Var.a;
                if (zc0Var != null) {
                    ((io0) zc0Var).a(false);
                    break;
                }
                break;
        }
    }
}
