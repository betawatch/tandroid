package nh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pr0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h0 implements wf.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // wf.d
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
                oe0 oe0Var = ((pe0) frameLayout).a;
                if (oe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((pr0) oe0Var).a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.N0();
        }
    }

    @Override // wf.d
    public final void b() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.o();
                break;
            case 1:
                ((m0) this.b).h.o();
                break;
            default:
                ((pe0) this.b).b.o();
                break;
        }
    }

    @Override // wf.d
    public final void c() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((m0) this.b).h.a.g(1, true);
                break;
            default:
                ((pe0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // wf.d
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
                oe0 oe0Var = ((pe0) frameLayout).a;
                if (oe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((pr0) oe0Var).a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override // wf.d
    public final void e() {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.k();
                break;
            case 1:
                ((m0) this.b).h.k();
                break;
            default:
                ((pe0) this.b).b.k();
                break;
        }
    }

    @Override // wf.d
    public final void f(float f9) {
        switch (this.a) {
            case 0:
                ((j0) this.b).f.setRotation(f9);
                break;
            case 1:
                ((m0) this.b).h.setRotation(f9);
                break;
            default:
                pe0 pe0Var = (pe0) this.b;
                pe0Var.b.setRotation(f9);
                pe0Var.getClass();
                oe0 oe0Var = pe0Var.a;
                if (oe0Var != null) {
                    ((pr0) oe0Var).a(false);
                    break;
                }
                break;
        }
    }
}
