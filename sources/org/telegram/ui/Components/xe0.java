package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xe0 implements zf.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ xe0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // zf.d
    public final boolean a() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                ze0 ze0Var = ((af0) frameLayout).a;
                if (ze0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.es0) ze0Var).a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.N0();
            case 1:
                qh.c0 c0Var = (qh.c0) frameLayout;
                c0Var.d.invalidate();
                return c0Var.f.j();
            default:
                qh.f0 f0Var = (qh.f0) frameLayout;
                f0Var.e.invalidate();
                return f0Var.h.j();
        }
    }

    @Override // zf.d
    public final void b() {
        switch (this.a) {
            case 0:
                ((af0) this.b).b.o();
                break;
            case 1:
                ((qh.c0) this.b).f.o();
                break;
            default:
                ((qh.f0) this.b).h.o();
                break;
        }
    }

    @Override // zf.d
    public final void c() {
        switch (this.a) {
            case 0:
                ((af0) this.b).b.a.g(1, true);
                break;
            case 1:
                ((qh.c0) this.b).f.a.g(1, true);
                break;
            default:
                ((qh.f0) this.b).h.a.g(1, true);
                break;
        }
    }

    @Override // zf.d
    public final boolean d() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                ze0 ze0Var = ((af0) frameLayout).a;
                if (ze0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.es0) ze0Var).a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.O0(-90.0f, false, null);
            case 1:
                qh.c0 c0Var = (qh.c0) frameLayout;
                qh.a0 a0Var = c0Var.f;
                boolean m9 = a0Var.m(-90.0f);
                a0Var.i();
                c0Var.d.invalidate();
                return m9;
            default:
                qh.f0 f0Var = (qh.f0) frameLayout;
                qh.a0 a0Var2 = f0Var.h;
                boolean m10 = a0Var2.m(-90.0f);
                a0Var2.i();
                f0Var.e.invalidate();
                return m10;
        }
    }

    @Override // zf.d
    public final void e() {
        switch (this.a) {
            case 0:
                ((af0) this.b).b.k();
                break;
            case 1:
                ((qh.c0) this.b).f.k();
                break;
            default:
                ((qh.f0) this.b).h.k();
                break;
        }
    }

    @Override // zf.d
    public final void f(float f10) {
        switch (this.a) {
            case 0:
                af0 af0Var = (af0) this.b;
                af0Var.b.setRotation(f10);
                af0Var.getClass();
                ze0 ze0Var = af0Var.a;
                if (ze0Var != null) {
                    ((org.telegram.ui.es0) ze0Var).a(false);
                    break;
                }
                break;
            case 1:
                ((qh.c0) this.b).f.setRotation(f10);
                break;
            default:
                ((qh.f0) this.b).h.setRotation(f10);
                break;
        }
    }
}
