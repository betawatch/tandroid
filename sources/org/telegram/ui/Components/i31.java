package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i31 extends eh.s {
    public final org.telegram.ui.v10 N;
    public final /* synthetic */ l31 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(l31 l31Var, Context context) {
        super(context);
        this.O = l31Var;
        this.N = new org.telegram.ui.v10();
    }

    @Override // eh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.O.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        lv0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.N.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
