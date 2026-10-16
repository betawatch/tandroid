package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i61 extends g71 {
    public final /* synthetic */ r71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(r71 r71Var, Context context, boolean z10) {
        super(r71Var, context, z10);
        this.E = r71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r71 r71Var = this.E;
        d61 d61Var = r71Var.g0;
        i61 i61Var = r71Var.f0;
        r61 r61Var = r71Var.U;
        if (r61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = d61Var.getX() + i61Var.getX();
            float y3 = d61Var.getY() + i61Var.getY();
            ah.h0 h0Var = (ah.h0) r61Var;
            ah.t0 t0Var = (ah.t0) h0Var.b;
            ah.s0 s0Var = t0Var.a;
            org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) h0Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            gl0Var.getDelegate().r(canvas, rectF, 0.0f, s0Var.getX() + x10, (t0Var.y == 1 ? s0Var.getY() - AndroidUtilities.statusBarHeight : s0Var.getY() + t0Var.c.getY()) + y3, 255, true);
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
