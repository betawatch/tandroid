package fi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.to0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h0 implements og.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // og.e
    public final boolean a() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
            case 0:
                j0 j0Var = (j0) frameLayout;
                j0Var.d.invalidate();
                return j0Var.f.j();
            case 1:
                m0 m0Var = (m0) frameLayout;
                m0Var.e.invalidate();
                return m0Var.h.j();
            default:
                fd0 fd0Var = ((gd0) frameLayout).a;
                if (fd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((to0) fd0Var).a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return photoViewer.H0();
        }
    }

    @Override // og.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((gd0) this.b).b.o();
                break;
        }
    }

    @Override // og.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((gd0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // og.e
    public final boolean d() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
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
                fd0 fd0Var = ((gd0) frameLayout).a;
                if (fd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((to0) fd0Var).a;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override // og.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((gd0) this.b).b.k();
                break;
        }
    }

    @Override // og.e
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f10);
                break;
            default:
                gd0 gd0Var = (gd0) this.b;
                gd0Var.b.setRotation(f10);
                gd0Var.getClass();
                fd0 fd0Var = gd0Var.a;
                if (fd0Var != null) {
                    ((to0) fd0Var).m(false);
                    break;
                }
                break;
        }
    }
}
