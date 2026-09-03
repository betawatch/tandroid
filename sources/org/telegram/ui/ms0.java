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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ms0 extends org.telegram.ui.Components.bd {
    public final Path q1;
    public final /* synthetic */ PhotoViewer r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(PhotoViewer photoViewer, Context context, pu0 pu0Var, org.telegram.ui.Components.qv0 qv0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar, tq0 tq0Var) {
        super(context, pu0Var, qv0Var, frameLayout, f6Var, baVar, tq0Var);
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
        ns0 ns0Var = this.r1.S1;
        if (ns0Var != null) {
            ns0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.bd
    public final boolean G() {
        ou0 ou0Var = this.r1.d;
        return ou0Var != null && ou0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.r1;
        ou0 ou0Var = photoViewer.d;
        D(ou0Var != null && ou0Var.l() && (photoViewer.R1.I.c() || !(photoViewer.o1 || TextUtils.isEmpty(photoViewer.f1().getText()))), true);
    }

    @Override // ph.k
    public final boolean e() {
        PhotoViewer photoViewer = this.r1;
        org.telegram.ui.Components.ic icVar = photoViewer.k7;
        if (icVar == null || org.telegram.ui.Components.ic.w != icVar) {
            return photoViewer.T2(photoViewer.b0);
        }
        return false;
    }

    @Override // ph.k
    public final boolean g() {
        return true;
    }

    @Override // ph.k
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10) {
        canvas.save();
        Path path = this.q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.r1;
        if (z10) {
            canvas.translate(((-getX()) - photoViewer.U1.getX()) + f11, ((-getY()) - photoViewer.U1.getY()) + f12);
        } else {
            canvas.translate(f11, f12);
        }
        photoViewer.T0(canvas, faVar, org.telegram.ui.ActionBar.j6.l1(1.0f, z4 ? -8882056 : -14277082), org.telegram.ui.ActionBar.j6.l1(1.0f, z10 ? z4 ? 0 : 855638016 : 1140850688), false, !z4, !z4 && z10);
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

    @Override // ph.k
    public final boolean l(float f10, float f11) {
        return (this.m0 || this.r1.r4 == 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.bd, ph.k
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.bd, ph.k
    public final void u(float f10) {
        super.u(f10);
        PhotoViewer photoViewer = this.r1;
        org.telegram.ui.ActionBar.l0 l0Var = photoViewer.b1;
        float f11 = 1.0f - f10;
        l0Var.setAlpha((l0Var.getTag() != null ? 1 : 0) * f11);
        org.telegram.ui.Components.h90 h90Var = photoViewer.c1;
        h90Var.setAlpha((h90Var.getTag() != null ? 1 : 0) * f11);
        FrameLayout frameLayout = photoViewer.N7;
        frameLayout.setAlpha(f11 * (frameLayout.getTag() != null ? 1 : 0));
    }

    @Override // ph.k
    public final void w() {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.bd, ph.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i10) {
        float f10;
        PhotoViewer photoViewer = this.r1;
        super.x(i10 - photoViewer.p2.bottom);
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        if (icVar != null) {
            icVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.O0;
        boolean z4 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i10 - r1.bottom) - photoViewer.M0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
        }
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
                        }
                    }
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

    @Override // ph.k
    public final void y() {
        org.telegram.ui.Components.zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.I.l);
        }
    }
}
