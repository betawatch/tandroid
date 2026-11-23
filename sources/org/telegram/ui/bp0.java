package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.Components.yc {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, vq0 vq0Var, org.telegram.ui.Components.du0 du0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar, hn0 hn0Var) {
        super(contextThemeWrapper, vq0Var, du0Var, frameLayout, h6Var, caVar, hn0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.yc
    public final void A() {
        PhotoViewer.P(this.u1);
    }

    @Override // org.telegram.ui.Components.yc
    public final void B() {
        z();
        ap0 ap0Var = this.u1.V1;
        if (ap0Var != null) {
            ap0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.yc
    public final boolean G() {
        uq0 uq0Var = this.u1.d;
        return uq0Var != null && uq0Var.l();
    }

    @Override // hi.o
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.gc gcVar = photoViewer.n7;
        if (gcVar == null || org.telegram.ui.Components.gc.w != gcVar) {
            return photoViewer.R2(photoViewer.f0);
        }
        return false;
    }

    @Override // hi.o
    public final boolean g() {
        return true;
    }

    @Override // hi.o
    public final void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f11, ((-getY()) - photoViewer.Z1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.N0(canvas, gaVar, org.telegram.ui.ActionBar.m6.r1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.m6.r1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.cz.c0 && ((i7 = this.u1.n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // hi.o
    public final boolean l(float f10, float f11) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // hi.o
    public final void w() {
        this.N.setReversed(true);
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.N.getAdapter().n0 = false;
            this.N.getAdapter().W(photoViewer.l4.r8);
            this.N.getAdapter().f0 = photoViewer.l4.e != null;
        } else {
            this.N.getAdapter().n0 = true;
            this.N.getAdapter().W(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
        this.N.setLayoutParams(c8.ma.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.yc, hi.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        boolean z10;
        PhotoViewer photoViewer = this.u1;
        super.x(i7 - photoViewer.t2.bottom);
        ViewPropertyAnimator animate = photoViewer.G.animate();
        if (photoViewer.K) {
            org.telegram.ui.Components.yc b12 = photoViewer.b1();
            bp0 bp0Var = photoViewer.W1;
            if (b12 != bp0Var || !bp0Var.M.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.Q0.getVisibility() != 0) {
                    if (photoViewer.K) {
                        org.telegram.ui.Components.yc b13 = photoViewer.b1();
                        bp0 bp0Var2 = photoViewer.W1;
                        if (b13 != bp0Var2 || !bp0Var2.M.c()) {
                            z10 = true;
                            photoViewer.m3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.m3(z10);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.Q0.getVisibility() != 0) {
        }
    }

    @Override // hi.o
    public final void y() {
        hi.j jVar = this.N;
        if (jVar != null) {
            jVar.setTranslationY(getEditTextHeight());
        }
    }
}
