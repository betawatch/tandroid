package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pw0 extends sg.r1 {
    public final /* synthetic */ qw0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(qw0 qw0Var, Context context) {
        super(context);
        this.N = qw0Var;
    }

    @Override // sg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            qw0 qw0Var = this.N;
            qw0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, qw0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), qw0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
