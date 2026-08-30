package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ve0 implements yf.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ ve0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // yf.d
    public final boolean a() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                xe0 xe0Var = ((ye0) frameLayout).a;
                if (xe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.xr0) xe0Var).a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.N0();
            case 1:
                ph.c0 c0Var = (ph.c0) frameLayout;
                c0Var.d.invalidate();
                return c0Var.f.j();
            default:
                ph.f0 f0Var = (ph.f0) frameLayout;
                f0Var.e.invalidate();
                return f0Var.h.j();
        }
    }

    @Override // yf.d
    public final void b() {
        switch (this.a) {
            case 0:
                ((ye0) this.b).b.o();
                break;
            case 1:
                ((ph.c0) this.b).f.o();
                break;
            default:
                ((ph.f0) this.b).h.o();
                break;
        }
    }

    @Override // yf.d
    public final void c() {
        switch (this.a) {
            case 0:
                ((ye0) this.b).b.a.g(1, true);
                break;
            case 1:
                ((ph.c0) this.b).f.a.g(1, true);
                break;
            default:
                ((ph.f0) this.b).h.a.g(1, true);
                break;
        }
    }

    @Override // yf.d
    public final boolean d() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                xe0 xe0Var = ((ye0) frameLayout).a;
                if (xe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.xr0) xe0Var).a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.O0(-90.0f, false, null);
            case 1:
                ph.c0 c0Var = (ph.c0) frameLayout;
                ph.a0 a0Var = c0Var.f;
                boolean m9 = a0Var.m(-90.0f);
                a0Var.i();
                c0Var.d.invalidate();
                return m9;
            default:
                ph.f0 f0Var = (ph.f0) frameLayout;
                ph.a0 a0Var2 = f0Var.h;
                boolean m10 = a0Var2.m(-90.0f);
                a0Var2.i();
                f0Var.e.invalidate();
                return m10;
        }
    }

    @Override // yf.d
    public final void e() {
        switch (this.a) {
            case 0:
                ((ye0) this.b).b.k();
                break;
            case 1:
                ((ph.c0) this.b).f.k();
                break;
            default:
                ((ph.f0) this.b).h.k();
                break;
        }
    }

    @Override // yf.d
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                ye0 ye0Var = (ye0) this.b;
                ye0Var.b.setRotation(f10);
                ye0Var.getClass();
                xe0 xe0Var = ye0Var.a;
                if (xe0Var != null) {
                    ((org.telegram.ui.xr0) xe0Var).a(false);
                    break;
                }
                break;
            case 1:
                ((ph.c0) this.b).f.setRotation(f10);
                break;
            default:
                ((ph.f0) this.b).h.setRotation(f10);
                break;
        }
    }
}
