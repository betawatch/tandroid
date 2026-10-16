package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.Components.md {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(PhotoViewer photoViewer, Context context, iv0 iv0Var, org.telegram.ui.Components.ow0 ow0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar, mr0 mr0Var) {
        super(context, iv0Var, ow0Var, frameLayout, c6Var, laVar, mr0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.md
    public final void A() {
        PhotoViewer.W(this.u1);
    }

    @Override // org.telegram.ui.Components.md
    public final void B() {
        z();
        it0 it0Var = this.u1.V1;
        if (it0Var != null) {
            it0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.md
    public final boolean G() {
        hv0 hv0Var = this.u1.d;
        return hv0Var != null && hv0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        hv0 hv0Var = photoViewer.d;
        D(hv0Var != null && hv0Var.l() && (photoViewer.U1.L.c() || !(photoViewer.r1 || TextUtils.isEmpty(photoViewer.f1().getText()))), true);
    }

    @Override // di.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.sc scVar = photoViewer.n7;
        if (scVar == null || org.telegram.ui.Components.sc.w != scVar) {
            return photoViewer.T2(photoViewer.e0);
        }
        return false;
    }

    @Override // di.m
    public final boolean g() {
        return true;
    }

    @Override // di.m
    public final void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z11) {
            canvas.translate(((-getX()) - photoViewer.X1.getX()) + f10, ((-getY()) - photoViewer.X1.getY()) + f11);
        } else {
            canvas.translate(f10, f11);
        }
        photoViewer.T0(canvas, paVar, org.telegram.ui.ActionBar.g6.m1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.g6.m1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
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

    @Override // org.telegram.ui.Components.md, di.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.md, di.m
    public final void u(float f7) {
        super.u(f7);
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.ActionBar.j0 j0Var = photoViewer.e1;
        float f10 = 1.0f - f7;
        j0Var.setAlpha((j0Var.getTag() != null ? 1 : 0) * f10);
        org.telegram.ui.Components.fa0 fa0Var = photoViewer.f1;
        fa0Var.setAlpha((fa0Var.getTag() != null ? 1 : 0) * f10);
        FrameLayout frameLayout = photoViewer.R7;
        frameLayout.setAlpha(f10 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // di.m
    public final void w() {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.md, di.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f7;
        PhotoViewer photoViewer = this.u1;
        super.x(i10 - photoViewer.s2.bottom);
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
        if (scVar != null) {
            scVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.R0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - r1.bottom) - photoViewer.P0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.md f12 = photoViewer.f1();
            it0 it0Var = photoViewer.V1;
            if (f12 != it0Var || !it0Var.L.c()) {
                f7 = 1.0f;
                animate.alpha(f7).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.md f13 = photoViewer.f1();
                        it0 it0Var2 = photoViewer.V1;
                        if (f13 != it0Var2 || !it0Var2.L.c()) {
                            z10 = true;
                        }
                    }
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
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.l);
        }
    }
}
