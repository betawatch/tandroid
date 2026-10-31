package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yd0 implements eg.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ yd0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // eg.e
    public final boolean a() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                ae0 ae0Var = ((be0) frameLayout).a;
                if (ae0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.bq0) ae0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.O0();
            case 1:
                vh.b0 b0Var = (vh.b0) frameLayout;
                b0Var.d.invalidate();
                return b0Var.f.j();
            default:
                vh.g0 g0Var = (vh.g0) frameLayout;
                g0Var.e.invalidate();
                return g0Var.h.j();
        }
    }

    @Override // eg.e
    public final void b() {
        switch (this.a) {
            case 0:
                ((be0) this.b).b.o();
                break;
            case 1:
                ((vh.b0) this.b).f.o();
                break;
            default:
                ((vh.g0) this.b).h.o();
                break;
        }
    }

    @Override // eg.e
    public final void c() {
        switch (this.a) {
            case 0:
                ((be0) this.b).b.a.g(1, true);
                break;
            case 1:
                ((vh.b0) this.b).f.a.g(1, true);
                break;
            default:
                ((vh.g0) this.b).h.a.g(1, true);
                break;
        }
    }

    @Override // eg.e
    public final boolean d() {
        int i10 = this.a;
        FrameLayout frameLayout = this.b;
        switch (i10) {
            case 0:
                ae0 ae0Var = ((be0) frameLayout).a;
                if (ae0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.bq0) ae0Var).a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
            case 1:
                vh.b0 b0Var = (vh.b0) frameLayout;
                vh.z zVar = b0Var.f;
                boolean m10 = zVar.m(-90.0f);
                zVar.i();
                b0Var.d.invalidate();
                return m10;
            default:
                vh.g0 g0Var = (vh.g0) frameLayout;
                vh.z zVar2 = g0Var.h;
                boolean m11 = zVar2.m(-90.0f);
                zVar2.i();
                g0Var.e.invalidate();
                return m11;
        }
    }

    @Override // eg.e
    public final void e() {
        switch (this.a) {
            case 0:
                ((be0) this.b).b.k();
                break;
            case 1:
                ((vh.b0) this.b).f.k();
                break;
            default:
                ((vh.g0) this.b).h.k();
                break;
        }
    }

    @Override // eg.e
    public final void f(float f7) {
        switch (this.a) {
            case 0:
                be0 be0Var = (be0) this.b;
                be0Var.b.setRotation(f7);
                be0Var.getClass();
                ae0 ae0Var = be0Var.a;
                if (ae0Var != null) {
                    ((org.telegram.ui.bq0) ae0Var).b(false);
                    break;
                }
                break;
            case 1:
                ((vh.b0) this.b).f.setRotation(f7);
                break;
            default:
                ((vh.g0) this.b).h.setRotation(f7);
                break;
        }
    }
}
