package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c41 extends jh.s {
    public final org.telegram.ui.h20 O;
    public final /* synthetic */ f41 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(f41 f41Var, Context context) {
        super(context);
        this.P = f41Var;
        this.O = new org.telegram.ui.h20();
    }

    @Override // jh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.P.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        cw0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.O.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
