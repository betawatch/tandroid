package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g51 extends wh.n {
    public final org.telegram.ui.w10 U;
    public final /* synthetic */ j51 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(j51 j51Var, Context context) {
        super(context);
        this.V = j51Var;
        this.U = new org.telegram.ui.w10();
    }

    @Override // wh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.V.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        ax0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.U.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
