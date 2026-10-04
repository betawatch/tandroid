package ci;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.os0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class h0 implements lg.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // lg.e
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
                ff0 ff0Var = ((gf0) frameLayout).a;
                if (ff0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((os0) ff0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.N0();
        }
    }

    @Override // lg.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((gf0) this.b).b.o();
                break;
        }
    }

    @Override // lg.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((gf0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // lg.e
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
                ff0 ff0Var = ((gf0) frameLayout).a;
                if (ff0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((os0) ff0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override // lg.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((gf0) this.b).b.k();
                break;
        }
    }

    @Override // lg.e
    public final void f(float f7) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f7);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f7);
                break;
            default:
                gf0 gf0Var = (gf0) this.b;
                gf0Var.b.setRotation(f7);
                gf0Var.getClass();
                ff0 ff0Var = gf0Var.a;
                if (ff0Var != null) {
                    ((os0) ff0Var).a(false);
                    break;
                }
                break;
        }
    }
}
