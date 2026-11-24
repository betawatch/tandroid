// default package

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c43 implements l43 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ c43(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // l43
    public final boolean a() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                e43 e43Var = (e43) frameLayout;
                e43Var.d.invalidate();
                return e43Var.f.j();
            case 1:
                j43 j43Var = (j43) frameLayout;
                j43Var.e.invalidate();
                return j43Var.h.j();
            default:
                w68 w68Var = ((x68) frameLayout).a;
                if (w68Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((e98) w68Var).a;
                Drawable[] drawableArr = PhotoViewer.d9;
                return photoViewer.J();
        }
    }

    @Override // l43
    public final void b() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((e43) frameLayout).f.o();
                break;
            case 1:
                ((j43) frameLayout).h.o();
                break;
            default:
                ((x68) frameLayout).b.o();
                break;
        }
    }

    @Override // l43
    public final void c() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((e43) frameLayout).f.a.g(1, true);
                break;
            case 1:
                ((j43) frameLayout).h.a.g(1, true);
                break;
            default:
                ((x68) frameLayout).b.a.g(1, true);
                break;
        }
    }

    @Override // l43
    public final boolean d() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                e43 e43Var = (e43) frameLayout;
                b43 b43Var = e43Var.f;
                boolean m = b43Var.m(-90.0f);
                b43Var.i();
                e43Var.d.invalidate();
                return m;
            case 1:
                j43 j43Var = (j43) frameLayout;
                b43 b43Var2 = j43Var.h;
                boolean m2 = b43Var2.m(-90.0f);
                b43Var2.i();
                j43Var.e.invalidate();
                return m2;
            default:
                w68 w68Var = ((x68) frameLayout).a;
                if (w68Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((e98) w68Var).a;
                Drawable[] drawableArr = PhotoViewer.d9;
                return photoViewer.K(-90.0f, false, null);
        }
    }

    @Override // l43
    public final void e() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((e43) frameLayout).f.k();
                break;
            case 1:
                ((j43) frameLayout).h.k();
                break;
            default:
                ((x68) frameLayout).b.k();
                break;
        }
    }

    @Override // l43
    public final void f(float f) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((e43) frameLayout).f.setRotation(f);
                break;
            case 1:
                ((j43) frameLayout).h.setRotation(f);
                break;
            default:
                x68 x68Var = (x68) frameLayout;
                x68Var.b.setRotation(f);
                w68 w68Var = x68Var.a;
                if (w68Var != null) {
                    ((e98) w68Var).b(false);
                    break;
                }
                break;
        }
    }
}
