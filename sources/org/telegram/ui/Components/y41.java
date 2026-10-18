package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class y41 extends wh.n {
    public final org.telegram.ui.u10 U;
    public final /* synthetic */ b51 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(b51 b51Var, Context context) {
        super(context);
        this.V = b51Var;
        this.U = new org.telegram.ui.u10();
    }

    @Override // wh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.V.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        vw0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.U.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
