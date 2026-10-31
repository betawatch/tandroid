package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kq0 extends org.telegram.ui.Components.nc {
    public final Path s1;
    public final /* synthetic */ PhotoViewer t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, fs0 fs0Var, org.telegram.ui.Components.uu0 uu0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.s9 s9Var, qo0 qo0Var) {
        super(contextThemeWrapper, fs0Var, uu0Var, frameLayout, p6Var, s9Var, qo0Var);
        this.t1 = photoViewer;
        this.s1 = new Path();
    }

    @Override // org.telegram.ui.Components.nc
    public final void A() {
        PhotoViewer.X(this.t1);
    }

    @Override // org.telegram.ui.Components.nc
    public final void B() {
        z();
        jq0 jq0Var = this.t1.U1;
        if (jq0Var != null) {
            jq0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.nc
    public final boolean G() {
        es0 es0Var = this.t1.d;
        return es0Var != null && es0Var.l();
    }

    @Override // vh.k
    public final boolean e() {
        PhotoViewer photoViewer = this.t1;
        org.telegram.ui.Components.wb wbVar = photoViewer.n7;
        if (wbVar == null || org.telegram.ui.Components.wb.w != wbVar) {
            return photoViewer.W2(photoViewer.e0);
        }
        return false;
    }

    @Override // vh.k
    public final boolean g() {
        return true;
    }

    @Override // vh.k
    public final void h(org.telegram.ui.Components.w9 w9Var, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        canvas.save();
        Path path = this.s1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.t1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f10, ((-getY()) - photoViewer.Y1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        photoViewer.U0(canvas, w9Var, org.telegram.ui.ActionBar.t6.r1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.t6.r1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (org.telegram.messenger.tz.c0 && ((i10 = this.t1.n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // vh.k
    public final boolean l(float f7, float f10) {
        return (this.o0 || this.t1.u4 == 0) ? false : true;
    }

    @Override // vh.k
    public final void w() {
        this.M.setReversed(true);
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.t1;
        if (photoViewer.l4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.l4.p8);
            this.M.getAdapter().e0 = photoViewer.l4.e != null;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().e0 = false;
        }
        this.M.getAdapter().f0 = false;
        this.M.setLayoutParams(w7.b6.e(-1, -1, 51));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.nc, vh.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f7;
        boolean z10;
        PhotoViewer photoViewer = this.t1;
        super.x(i10 - photoViewer.s2.bottom);
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.nc h12 = photoViewer.h1();
            kq0 kq0Var = photoViewer.V1;
            if (h12 != kq0Var || !kq0Var.L.c()) {
                f7 = 1.0f;
                animate.alpha(f7).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.nc h13 = photoViewer.h1();
                        kq0 kq0Var2 = photoViewer.V1;
                        if (h13 != kq0Var2 || !kq0Var2.L.c()) {
                            z10 = true;
                            photoViewer.r3(z10);
                            return;
                        }
                    }
                    z10 = false;
                    photoViewer.r3(z10);
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

    @Override // vh.k
    public final void y() {
        org.telegram.ui.Components.oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.setTranslationY(getEditTextHeight());
        }
    }
}
