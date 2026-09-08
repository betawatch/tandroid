package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.Components.ld {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, bv0 bv0Var, org.telegram.ui.Components.ov0 ov0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar, ir0 ir0Var) {
        super(contextThemeWrapper, bv0Var, ov0Var, frameLayout, f6Var, jaVar, ir0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.ld
    public final void A() {
        PhotoViewer.W(this.u1);
    }

    @Override // org.telegram.ui.Components.ld
    public final void B() {
        z();
        at0 at0Var = this.u1.U1;
        if (at0Var != null) {
            at0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.ld
    public final boolean G() {
        av0 av0Var = this.u1.d;
        return av0Var != null && av0Var.l();
    }

    @Override // di.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.qc qcVar = photoViewer.n7;
        if (qcVar == null || org.telegram.ui.Components.qc.w != qcVar) {
            return photoViewer.T2(photoViewer.e0);
        }
        return false;
    }

    @Override // di.m
    public final boolean g() {
        return true;
    }

    @Override // di.m
    public final void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f10, ((-getY()) - photoViewer.Y1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        photoViewer.T0(canvas, naVar, org.telegram.ui.ActionBar.j6.l1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.j6.l1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.u1.n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // di.m
    public final boolean l(float f7, float f10) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // di.m
    public final void w() {
        this.M.setReversed(true);
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.Z7);
            this.M.getAdapter().e0 = photoViewer.l4.e != null;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().e0 = false;
        }
        this.M.getAdapter().f0 = false;
        this.M.setLayoutParams(w7.x5.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ld, di.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f7;
        boolean z10;
        PhotoViewer photoViewer = this.u1;
        super.x(i10 - photoViewer.s2.bottom);
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.ld f12 = photoViewer.f1();
            bt0 bt0Var = photoViewer.V1;
            if (f12 != bt0Var || !bt0Var.L.c()) {
                f7 = 1.0f;
                animate.alpha(f7).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.ld f13 = photoViewer.f1();
                        bt0 bt0Var2 = photoViewer.V1;
                        if (f13 != bt0Var2 || !bt0Var2.L.c()) {
                            z10 = true;
                            photoViewer.o3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.o3(z10);
                    return;
                }
                return;
            }
        }
        f7 = 0.0f;
        animate.alpha(f7).start();
        if (photoViewer.P0.getVisibility() != 0) {
        }
    }

    @Override // di.m
    public final void y() {
        di.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(getEditTextHeight());
        }
    }
}
