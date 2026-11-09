package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.Components.uc {
    public final Path s1;
    public final /* synthetic */ PhotoViewer t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(PhotoViewer photoViewer, Context context, xq0 xq0Var, org.telegram.ui.Components.tt0 tt0Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.y9 y9Var, en0 en0Var) {
        super(context, xq0Var, tt0Var, frameLayout, g6Var, y9Var, en0Var);
        this.t1 = photoViewer;
        this.s1 = new Path();
    }

    @Override // org.telegram.ui.Components.uc
    public final void A() {
        PhotoViewer.O(this.t1);
    }

    @Override // org.telegram.ui.Components.uc
    public final void B() {
        z();
        cp0 cp0Var = this.t1.V1;
        if (cp0Var != null) {
            cp0Var.z();
        }
    }

    @Override // org.telegram.ui.Components.uc
    public final boolean G() {
        wq0 wq0Var = this.t1.d;
        return wq0Var != null && wq0Var.l();
    }

    public final void I() {
        PhotoViewer photoViewer = this.t1;
        wq0 wq0Var = photoViewer.d;
        D(wq0Var != null && wq0Var.l() && (photoViewer.U1.L.c() || !(photoViewer.r1 || TextUtils.isEmpty(photoViewer.a1().getText()))), true);
    }

    @Override // fi.m
    public final boolean e() {
        PhotoViewer photoViewer = this.t1;
        org.telegram.ui.Components.cc ccVar = photoViewer.m7;
        if (ccVar == null || org.telegram.ui.Components.cc.w != ccVar) {
            return photoViewer.Q2(photoViewer.e0);
        }
        return false;
    }

    @Override // fi.m
    public final boolean g() {
        return true;
    }

    @Override // fi.m
    public final void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
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
        photoViewer.N0(canvas, caVar, org.telegram.ui.ActionBar.l6.r1(1.0f, z9 ? -8882056 : -14277082), org.telegram.ui.ActionBar.l6.r1(1.0f, z10 ? z9 ? 0 : 855638016 : 1140850688), false, !z9, !z9 && z10);
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

    @Override // org.telegram.ui.Components.uc, fi.m
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override // org.telegram.ui.Components.uc, fi.m
    public final void u(float f10) {
        super.u(f10);
        PhotoViewer photoViewer = this.t1;
        org.telegram.ui.ActionBar.f0 f0Var = photoViewer.e1;
        float f11 = 1.0f - f10;
        f0Var.setAlpha((f0Var.getTag() != null ? 1 : 0) * f11);
        org.telegram.ui.Components.z70 z70Var = photoViewer.f1;
        z70Var.setAlpha((z70Var.getTag() != null ? 1 : 0) * f11);
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
    @Override // org.telegram.ui.Components.uc, fi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i7) {
        float f10;
        PhotoViewer photoViewer = this.t1;
        super.x(i7 - photoViewer.s2.bottom);
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        if (ccVar != null) {
            ccVar.l();
        }
        I();
        FrameLayout frameLayout = photoViewer.R0;
        boolean z9 = false;
        if (frameLayout != null) {
            frameLayout.animate().translationY(-Math.max(0, (i7 - r1.bottom) - photoViewer.P0.getHeight())).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
        }
        ViewPropertyAnimator animate = photoViewer.F.animate();
        if (photoViewer.J) {
            org.telegram.ui.Components.uc a12 = photoViewer.a1();
            cp0 cp0Var = photoViewer.V1;
            if (a12 != cp0Var || !cp0Var.L.c()) {
                f10 = 1.0f;
                animate.alpha(f10).start();
                if (photoViewer.P0.getVisibility() != 0) {
                    if (photoViewer.J) {
                        org.telegram.ui.Components.uc a13 = photoViewer.a1();
                        cp0 cp0Var2 = photoViewer.V1;
                        if (a13 != cp0Var2 || !cp0Var2.L.c()) {
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
