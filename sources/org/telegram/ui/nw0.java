package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nw0 extends sg.q1 {
    public final /* synthetic */ ow0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(ow0 ow0Var, Context context) {
        super(context);
        this.N = ow0Var;
    }

    @Override // sg.q1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ow0 ow0Var = this.N;
            ow0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ow0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ow0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
