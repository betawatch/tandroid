package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c41 extends ih.s {
    public final org.telegram.ui.i20 O;
    public final /* synthetic */ f41 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(f41 f41Var, Context context) {
        super(context);
        this.P = f41Var;
        this.O = new org.telegram.ui.i20();
    }

    @Override // ih.s, android.widget.TextView, android.view.View
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
