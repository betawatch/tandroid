package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cp0 extends org.telegram.ui.Components.tc {
    public final Path s1;
    public final /* synthetic */ PhotoViewer t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(PhotoViewer photoViewer, Context context, yq0 yq0Var, org.telegram.ui.Components.st0 st0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var, fn0 fn0Var) {
        super(context, yq0Var, st0Var, frameLayout, h6Var, x9Var, fn0Var);
        this.t1 = photoViewer;
        this.s1 = new Path();
    }

    @Override // org.telegram.ui.Components.tc
    public final void A() {
        PhotoViewer.O(this.t1);
    }

    @Override // org.telegram.ui.Components.tc
    public final void B() {
        z();
        dp0 dp0Var = this.t1.V1;
        if (dp0Var != null) {
            dp0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.tc
    public final boolean G() {
        xq0 xq0Var = this.t1.d;
        return xq0Var != null && xq0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.t1;
        xq0 xq0Var = photoViewer.d;
        D(xq0Var != null && xq0Var.l() && (photoViewer.U1.L.c() || !(photoViewer.r1 || TextUtils.isEmpty(photoViewer.a1().getText()))), true);
    }

    @Override // fi.m
    public final boolean e() {
        PhotoViewer photoViewer = this.t1;
        org.telegram.ui.Components.bc bcVar = photoViewer.m7;
        if (bcVar == null || org.telegram.ui.Components.bc.w != bcVar) {
            return photoViewer.Q2(photoViewer.e0);
        }
        return false;
    }

    @Override // fi.m
    public final boolean g() {
        return true;
    }

    @Override // fi.m
    public final void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        canvas.save();
        Path path = this.s1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.t1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.X1.getX()) + f11, ((-getY()) - photoViewer.X1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.N0(canvas, baVar, org.telegram.ui.ActionBar.m6.r1(1.0f, z9 ? -8882056 : -14277082), org.telegram.ui.ActionBar.m6.r1(1.0f, z10 ? z9 ? 0 : 855638016 : 1140850688), false, !z9, !z9 && z10);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.c0 && ((i7 = this.t1.m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // fi.m
    public final boolean l(float f10, float f11) {
        return (this.o0 || this.t1.t4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.tc, fi.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.tc, fi.m
    public final void u(float f10) {
        super.u(f10);
        PhotoViewer photoViewer = this.t1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.e1;
        float f11 = 1.0f - f10;
        f0Var.setAlpha((f0Var.getTag() != null ? 1 : 0) * f11);
        org.telegram.ui.Components.y70 y70Var = photoViewer.f1;
        y70Var.setAlpha((y70Var.getTag() != null ? 1 : 0) * f11);
        FrameLayout frameLayout = photoViewer.Q7;
        frameLayout.setAlpha(f11 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // fi.m
    public final void w() {
        this.M.getAdapter().c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        PhotoViewer photoViewer = this.t1;
        if (photoViewer.k4 != null) {
            this.M.getAdapter().m0 = false;
            this.M.getAdapter().W(photoViewer.k4.p8);
            this.M.getAdapter().e0 = photoViewer.k4.e != null;
        } else {
            this.M.getAdapter().m0 = true;
            this.M.getAdapter().W(null);
            this.M.getAdapter().e0 = false;
        }
        this.M.getAdapter().f0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.tc, fi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        PhotoViewer photoViewer = this.t1;
        super.x(i7 - photoViewer.s2.bottom);
        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.w;
        if (bcVar != null) {
            bcVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.R0;
        boolean z9 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i7 - r1.bottom) - photoViewer.P0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.tc a12 = photoViewer.a1();
            dp0 dp0Var = photoViewer.V1;
            if (a12 != dp0Var || !dp0Var.L.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.tc a13 = photoViewer.a1();
                        dp0 dp0Var2 = photoViewer.V1;
                        if (a13 != dp0Var2 || !dp0Var2.L.c()) {
                            z9 = true;
                        }
                    }
                    photoViewer.l3(z9);
                    return;
                }
                return;
            }
        }
        f10 = 0.0f;
        animate.alpha(f10).start();
        if (photoViewer.P0.getVisibility() != 0) {
        }
    }

    @Override // fi.m
    public final void y() {
        fi.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - org.telegram.messenger.g0.L(14.0f)) - this.L.l);
        }
    }
}
