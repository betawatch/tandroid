package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class we0 implements yf.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ we0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // yf.d
    public final boolean a() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                ye0 ye0Var = ((ze0) frameLayout).a;
                if (ye0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.es0) ye0Var).a;
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
                ((ze0) this.b).b.o();
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
                ((ze0) this.b).b.a.g(1, true);
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
                ye0 ye0Var = ((ze0) frameLayout).a;
                if (ye0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.es0) ye0Var).a;
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
                ((ze0) this.b).b.k();
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
                ze0 ze0Var = (ze0) this.b;
                ze0Var.b.setRotation(f10);
                ze0Var.getClass();
                ye0 ye0Var = ze0Var.a;
                if (ye0Var != null) {
                    ((org.telegram.ui.es0) ye0Var).a(false);
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
