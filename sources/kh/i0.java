package kh;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.qr0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i0 implements tf.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ i0(int i9, FrameLayout frameLayout) {
        this.a = i9;
        this.b = frameLayout;
    }

    @Override // tf.d
    public final boolean a() {
        int i9 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i9) {
            case 0:
                k0 k0Var = (k0) frameLayout;
                k0Var.d.invalidate();
                return k0Var.f.j();
            case 1:
                n0 n0Var = (n0) frameLayout;
                n0Var.e.invalidate();
                return n0Var.h.j();
            default:
                ae0 ae0Var = ((be0) frameLayout).a;
                if (ae0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((qr0) ae0Var).a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.N0();
        }
    }

    @Override // tf.d
    public final void b() {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.o();
                break;
            case 1:
                ((n0) this.b).h.o();
                break;
            default:
                ((be0) this.b).b.o();
                break;
        }
    }

    @Override // tf.d
    public final void c() {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.a.g(1, true);
                break;
            case 1:
                ((n0) this.b).h.a.g(1, true);
                break;
            default:
                ((be0) this.b).b.a.g(1, true);
                break;
        }
    }

    @Override // tf.d
    public final boolean d() {
        int i9 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i9) {
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
                ae0 ae0Var = ((be0) frameLayout).a;
                if (ae0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((qr0) ae0Var).a;
                Drawable[] drawableArr = PhotoViewer.P8;
                return photoViewer.O0(-90.0f, false, null);
        }
    }

    @Override // tf.d
    public final void e() {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.k();
                break;
            case 1:
                ((n0) this.b).h.k();
                break;
            default:
                ((be0) this.b).b.k();
                break;
        }
    }

    @Override // tf.d
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ((k0) this.b).f.setRotation(f10);
                break;
            case 1:
                ((n0) this.b).h.setRotation(f10);
                break;
            default:
                be0 be0Var = (be0) this.b;
                be0Var.b.setRotation(f10);
                be0Var.getClass();
                ae0 ae0Var = be0Var.a;
                if (ae0Var != null) {
                    ((qr0) ae0Var).a(false);
                    break;
                }
                break;
        }
    }
}
