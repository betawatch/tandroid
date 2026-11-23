package hi;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.so0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class j0 implements og.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ j0(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // og.e
    public final boolean a() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) frameLayout;
                l0Var.d.invalidate();
                return l0Var.f.j();
            case 1:
                o0 o0Var = (o0) frameLayout;
                o0Var.e.invalidate();
                return o0Var.h.j();
            default:
                qd0 qd0Var = ((rd0) frameLayout).a;
                if (qd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((so0) qd0Var).a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.H0();
        }
    }

    @Override // og.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((l0) this.b).f.o();
                break;
            case 1:
                ((o0) this.b).h.o();
                break;
            default:
                ((rd0) this.b).b.o();
                break;
        }
    }

    @Override // og.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((l0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((o0) this.b).h.a.g(1, true);
                break;
            default:
                ((rd0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // og.e
    public final boolean d() {
        int i7 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) frameLayout;
                i0 i0Var = l0Var.f;
                boolean m10 = i0Var.m(-90.0f);
                i0Var.i();
                l0Var.d.invalidate();
                return m10;
            case 1:
                o0 o0Var = (o0) frameLayout;
                i0 i0Var2 = o0Var.h;
                boolean m11 = i0Var2.m(-90.0f);
                i0Var2.i();
                o0Var.e.invalidate();
                return m11;
            default:
                qd0 qd0Var = ((rd0) frameLayout).a;
                if (qd0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((so0) qd0Var).a;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return photoViewer.I0(-90.0f, false, null);
        }
    }

    @Override // og.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((l0) this.b).f.k();
                break;
            case 1:
                ((o0) this.b).h.k();
                break;
            default:
                ((rd0) this.b).b.k();
                break;
        }
    }

    @Override // og.e
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ((l0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((o0) this.b).h.setRotation(f10);
                break;
            default:
                rd0 rd0Var = (rd0) this.b;
                rd0Var.b.setRotation(f10);
                rd0Var.getClass();
                qd0 qd0Var = rd0Var.a;
                if (qd0Var != null) {
                    ((so0) qd0Var).n(false);
                    break;
                }
                break;
        }
    }
}
