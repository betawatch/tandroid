package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nw0 extends sg.r1 {
    public final /* synthetic */ ow0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(ow0 ow0Var, Context context) {
        super(context);
        this.N = ow0Var;
    }

    @Override // sg.r1, android.view.ViewGroup, android.view.View
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
