package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class hx0 extends rg.p1 {
    public final /* synthetic */ ix0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(ix0 ix0Var, Context context) {
        super(context);
        this.N = ix0Var;
    }

    @Override // rg.p1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ix0 ix0Var = this.N;
            ix0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ix0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ix0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
