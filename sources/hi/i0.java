package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.so0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i0 implements og.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ i0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // og.e
    public final boolean a() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                k0Var.d.invalidate();
                return k0Var.f.j();
            case 1:
                n0 n0Var = (n0) frameLayout;
                n0Var.e.invalidate();
                return n0Var.h.j();
            default:
                pd0 pd0Var = ((qd0) frameLayout).a;
                if (pd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((so0) pd0Var).a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.H0();
        }
    }

    @Override // og.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.o();
                break;
            case 1:
                ((n0) this.b).h.o();
                break;
            default:
                ((qd0) this.b).b.o();
                break;
        }
    }

    @Override // og.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((n0) this.b).h.a.g(1, true);
                break;
            default:
                ((qd0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // og.e
    public final boolean d() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                h0 h0Var = k0Var.f;
                boolean m10 = h0Var.m(-90.0f);
                h0Var.i();
                k0Var.d.invalidate();
                return m10;
            case 1:
                n0 n0Var = (n0) frameLayout;
                h0 h0Var2 = n0Var.h;
                boolean m11 = h0Var2.m(-90.0f);
                h0Var2.i();
                n0Var.e.invalidate();
                return m11;
            default:
                pd0 pd0Var = ((qd0) frameLayout).a;
                if (pd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((so0) pd0Var).a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override // og.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.k();
                break;
            case 1:
                ((n0) this.b).h.k();
                break;
            default:
                ((qd0) this.b).b.k();
                break;
        }
    }

    @Override // og.e
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((n0) this.b).h.setRotation(f10);
                break;
            default:
                qd0 qd0Var = (qd0) this.b;
                qd0Var.b.setRotation(f10);
                qd0Var.getClass();
                pd0 pd0Var = qd0Var.a;
                if (pd0Var != null) {
                    ((so0) pd0Var).n(false);
                    break;
                }
                break;
        }
    }
}
