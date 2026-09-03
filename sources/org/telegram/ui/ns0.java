package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ns0 extends org.telegram.ui.Components.bd {
    public final Path q1;
    public final /* synthetic */ PhotoViewer r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, pu0 pu0Var, org.telegram.ui.Components.pv0 pv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar, tq0 tq0Var) {
        super(contextThemeWrapper, pu0Var, pv0Var, frameLayout, g6Var, baVar, tq0Var);
        this.r1 = photoViewer;
        this.q1 = new Path();
    }

    @Override // org.telegram.ui.Components.bd
    public final void A() {
        PhotoViewer.W(this.r1);
    }

    @Override // org.telegram.ui.Components.bd
    public final void B() {
        z();
        ms0 ms0Var = this.r1.R1;
        if (ms0Var != null) {
            ms0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.bd
    public final boolean G() {
        ou0 ou0Var = this.r1.d;
        return ou0Var != null && ou0Var.l();
    }

    @Override // qh.k
    public final boolean e() {
        PhotoViewer photoViewer = this.r1;
        org.telegram.ui.Components.ic icVar = photoViewer.k7;
        if (icVar == null || org.telegram.ui.Components.ic.w != icVar) {
            return photoViewer.T2(photoViewer.b0);
        }
        return false;
    }

    @Override // qh.k
    public final boolean g() {
        return true;
    }

    @Override // qh.k
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10) {
        canvas.save();
        Path path = this.q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.r1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.V1.getX()) + f11, ((-getY()) - photoViewer.V1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.T0(canvas, faVar, org.telegram.ui.ActionBar.k6.l1(1.0f, z4 ? -8882056 : -14277082), org.telegram.ui.ActionBar.k6.l1(1.0f, z10 ? z4 ? 0 : 855638016 : 1140850688), false, !z4, !z4 && z10);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.r1.k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // qh.k
    public final boolean l(float f10, float f11) {
        return (this.m0 || this.r1.r4 == 0) ? false : true;
    }

    @Override // qh.k
    public final void w() {
        this.J.setReversed(true);
        this.J.getAdapter().c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().e = false;
        PhotoViewer photoViewer = this.r1;
        if (photoViewer.i4 != null) {
            this.J.getAdapter().j0 = false;
            this.J.getAdapter().W(photoViewer.i4.W7);
            this.J.getAdapter().b0 = photoViewer.i4.e != null;
        } else {
            this.J.getAdapter().j0 = true;
            this.J.getAdapter().W(null);
            this.J.getAdapter().b0 = false;
        }
        this.J.getAdapter().c0 = false;
        this.J.setLayoutParams(k7.c6.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.bd, qh.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f10;
        boolean z4;
        PhotoViewer photoViewer = this.r1;
        super.x(i10 - photoViewer.p2.bottom);
        ViewPropertyAnimator animate = photoViewer.C.animate();
        if (photoViewer.G) {
            org.telegram.ui.Components.bd f12 = photoViewer.f1();
            ns0 ns0Var = photoViewer.S1;
            if (f12 != ns0Var || !ns0Var.I.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.M0.getVisibility() != 0) {
                    if (photoViewer.G) {
                        org.telegram.ui.Components.bd f13 = photoViewer.f1();
                        ns0 ns0Var2 = photoViewer.S1;
                        if (f13 != ns0Var2 || !ns0Var2.I.c()) {
                            z4 = true;
                            photoViewer.o3(z4);
                            return;
                        }
                    }
                    z4 = false;
                    photoViewer.o3(z4);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.M0.getVisibility() != 0) {
        }
    }

    @Override // qh.k
    public final void y() {
        org.telegram.ui.Components.zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setTranslationY(getEditTextHeight());
        }
    }
}
