package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class b51 extends vh.n {
    public final org.telegram.ui.k20 R;
    public final /* synthetic */ e51 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(e51 e51Var, Context context) {
        super(context);
        this.S = e51Var;
        this.R = new org.telegram.ui.k20();
    }

    @Override // vh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.S.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        yw0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.R.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
