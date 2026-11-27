// default package

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j33 implements s33 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ j33(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // s33
    public final boolean a() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                l33 l33Var = (l33) frameLayout;
                l33Var.d.invalidate();
                return l33Var.f.j();
            case 1:
                q33 q33Var = (q33) frameLayout;
                q33Var.e.invalidate();
                return q33Var.h.j();
            default:
                j88 j88Var = ((k88) frameLayout).a;
                if (j88Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ua8) j88Var).a;
                Drawable[] drawableArr = PhotoViewer.d9;
                return photoViewer.J();
        }
    }

    @Override // s33
    public final void b() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.o();
                break;
            case 1:
                ((q33) frameLayout).h.o();
                break;
            default:
                ((k88) frameLayout).b.o();
                break;
        }
    }

    @Override // s33
    public final void c() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.a.g(1, true);
                break;
            case 1:
                ((q33) frameLayout).h.a.g(1, true);
                break;
            default:
                ((k88) frameLayout).b.a.g(1, true);
                break;
        }
    }

    @Override // s33
    public final boolean d() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                l33 l33Var = (l33) frameLayout;
                i33 i33Var = l33Var.f;
                boolean m = i33Var.m(-90.0f);
                i33Var.i();
                l33Var.d.invalidate();
                return m;
            case 1:
                q33 q33Var = (q33) frameLayout;
                i33 i33Var2 = q33Var.h;
                boolean m2 = i33Var2.m(-90.0f);
                i33Var2.i();
                q33Var.e.invalidate();
                return m2;
            default:
                j88 j88Var = ((k88) frameLayout).a;
                if (j88Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((ua8) j88Var).a;
                Drawable[] drawableArr = PhotoViewer.d9;
                return photoViewer.K(-90.0f, false, null);
        }
    }

    @Override // s33
    public final void e() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.k();
                break;
            case 1:
                ((q33) frameLayout).h.k();
                break;
            default:
                ((k88) frameLayout).b.k();
                break;
        }
    }

    @Override // s33
    public final void f(float f) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ((l33) frameLayout).f.setRotation(f);
                break;
            case 1:
                ((q33) frameLayout).h.setRotation(f);
                break;
            default:
                k88 k88Var = (k88) frameLayout;
                k88Var.b.setRotation(f);
                j88 j88Var = k88Var.a;
                if (j88Var != null) {
                    ((ua8) j88Var).b(false);
                    break;
                }
                break;
        }
    }
}
