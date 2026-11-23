package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fo0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q0 implements og.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ q0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // og.e
    public final boolean a() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
            case 0:
                s0 s0Var = (s0) frameLayout;
                s0Var.d.invalidate();
                return s0Var.f.j();
            case 1:
                w0 w0Var = (w0) frameLayout;
                w0Var.e.invalidate();
                return w0Var.h.j();
            default:
                pd0 pd0Var = ((qd0) frameLayout).a;
                if (pd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((fo0) pd0Var).a;
                Drawable[] drawableArr = PhotoViewer.f9;
                return photoViewer.H0();
        }
    }

    @Override // og.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((s0) this.b).f.o();
                break;
            case 1:
                ((w0) this.b).h.o();
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
                ((s0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((w0) this.b).h.a.g(1, true);
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
                s0 s0Var = (s0) frameLayout;
                p0 p0Var = s0Var.f;
                boolean m10 = p0Var.m(-90.0f);
                p0Var.i();
                s0Var.d.invalidate();
                return m10;
            case 1:
                w0 w0Var = (w0) frameLayout;
                p0 p0Var2 = w0Var.h;
                boolean m11 = p0Var2.m(-90.0f);
                p0Var2.i();
                w0Var.e.invalidate();
                return m11;
            default:
                pd0 pd0Var = ((qd0) frameLayout).a;
                if (pd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((fo0) pd0Var).a;
                Drawable[] drawableArr = PhotoViewer.f9;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override // og.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((s0) this.b).f.k();
                break;
            case 1:
                ((w0) this.b).h.k();
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
                ((s0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((w0) this.b).h.setRotation(f10);
                break;
            default:
                qd0 qd0Var = (qd0) this.b;
                qd0Var.b.setRotation(f10);
                qd0Var.getClass();
                pd0 pd0Var = qd0Var.a;
                if (pd0Var != null) {
                    ((fo0) pd0Var).k(false);
                    break;
                }
                break;
        }
    }
}
