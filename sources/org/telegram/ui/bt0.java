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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.Components.jd {
    public final Path t1;
    public final /* synthetic */ PhotoViewer u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(PhotoViewer photoViewer, Context context, cv0 cv0Var, org.telegram.ui.Components.pv0 pv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ha haVar, ir0 ir0Var) {
        super(context, cv0Var, pv0Var, frameLayout, e6Var, haVar, ir0Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override // org.telegram.ui.Components.jd
    public final void A() {
        PhotoViewer.W(this.u1);
    }

    @Override // org.telegram.ui.Components.jd
    public final void B() {
        z();
        ct0 ct0Var = this.u1.V1;
        if (ct0Var != null) {
            ct0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.jd
    public final boolean G() {
        bv0 bv0Var = this.u1.d;
        return bv0Var != null && bv0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.u1;
        bv0 bv0Var = photoViewer.d;
        D(bv0Var != null && bv0Var.l() && (photoViewer.U1.L.c() || !(photoViewer.r1 || TextUtils.isEmpty(photoViewer.f1().getText()))), true);
    }

    @Override // ci.m
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.Components.oc ocVar = photoViewer.n7;
        if (ocVar == null || org.telegram.ui.Components.oc.w != ocVar) {
            return photoViewer.S2(photoViewer.e0);
        }
        return false;
    }

    @Override // ci.m
    public final boolean g() {
        return true;
    }

    @Override // ci.m
    public final void h(org.telegram.ui.Components.la laVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
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
        photoViewer.T0(canvas, laVar, org.telegram.ui.ActionBar.i6.l1(1.0f, z10 ? -8882056 : -14277082), org.telegram.ui.ActionBar.i6.l1(1.0f, z11 ? z10 ? 0 : 855638016 : 1140850688), false, !z10, !z10 && z11);
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

    @Override // ci.m
    public final boolean l(float f7, float f10) {
        return (this.p0 || this.u1.u4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.jd, ci.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.jd, ci.m
    public final void u(float f7) {
        super.u(f7);
        PhotoViewer photoViewer = this.u1;
        org.telegram.ui.ActionBar.k0 k0Var = photoViewer.e1;
        float f10 = 1.0f - f7;
        k0Var.setAlpha((k0Var.getTag() != null ? 1 : 0) * f10);
        org.telegram.ui.Components.e90 e90Var = photoViewer.f1;
        e90Var.setAlpha((e90Var.getTag() != null ? 1 : 0) * f10);
        FrameLayout frameLayout = photoViewer.R7;
        frameLayout.setAlpha(f10 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // ci.m
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
    @Override // org.telegram.ui.Components.jd, ci.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f7;
        PhotoViewer photoViewer = this.u1;
        super.x(i10 - photoViewer.s2.bottom);
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
        if (ocVar != null) {
            ocVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.R0;
        boolean z10 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - r1.bottom) - photoViewer.P0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.jd f12 = photoViewer.f1();
            ct0 ct0Var = photoViewer.V1;
            if (f12 != ct0Var || !ct0Var.L.c()) {
                f7 = 1.0f;
                animate.alpha(f7).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.jd f13 = photoViewer.f1();
                        ct0 ct0Var2 = photoViewer.V1;
                        if (f13 != ct0Var2 || !ct0Var2.L.c()) {
                            z10 = true;
                        }
                    }
                    photoViewer.n3(z10);
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

    @Override // ci.m
    public final void y() {
        ci.i iVar = this.M;
        if (iVar != null) {
            iVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.L.l);
        }
    }
}
