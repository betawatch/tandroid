package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class o41 extends m51 {
    public final /* synthetic */ x51 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(x51 x51Var, Context context, boolean z10) {
        super(x51Var, context, z10);
        this.E = x51Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x51 x51Var = this.E;
        j41 j41Var = x51Var.g0;
        o41 o41Var = x51Var.f0;
        x41 x41Var = x51Var.U;
        if (x41Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = j41Var.getX() + o41Var.getX();
            float y3 = j41Var.getY() + o41Var.getY();
            ah.h0 h0Var = (ah.h0) x41Var;
            ah.t0 t0Var = (ah.t0) h0Var.b;
            ah.s0 s0Var = t0Var.a;
            org.telegram.ui.Components.cl0 cl0Var = (org.telegram.ui.Components.cl0) h0Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            cl0Var.getDelegate().q(canvas, rectF, 0.0f, s0Var.getX() + x10, (t0Var.y == 1 ? s0Var.getY() - AndroidUtilities.statusBarHeight : s0Var.getY() + t0Var.c.getY()) + y3, 255, true);
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
