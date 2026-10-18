package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class q41 extends o51 {
    public final /* synthetic */ z51 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(z51 z51Var, Context context, boolean z10) {
        super(z51Var, context, z10);
        this.E = z51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z51 z51Var = this.E;
        l41 l41Var = z51Var.g0;
        q41 q41Var = z51Var.f0;
        z41 z41Var = z51Var.U;
        if (z41Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l41Var.getX() + q41Var.getX();
            float y3 = l41Var.getY() + q41Var.getY();
            ah.h0 h0Var = (ah.h0) z41Var;
            ah.t0 t0Var = (ah.t0) h0Var.b;
            ah.s0 s0Var = t0Var.a;
            org.telegram.ui.Components.cl0 cl0Var = (org.telegram.ui.Components.cl0) h0Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            cl0Var.getDelegate().m(canvas, rectF, 0.0f, s0Var.getX() + x10, (t0Var.y == 1 ? s0Var.getY() - AndroidUtilities.statusBarHeight : s0Var.getY() + t0Var.c.getY()) + y3, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.E.U != null) {
                invalidate();
            }
        }
    }
}
