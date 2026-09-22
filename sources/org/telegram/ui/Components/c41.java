package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c41 extends vh.o {
    public final org.telegram.ui.l20 R;
    public final /* synthetic */ f41 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(f41 f41Var, Context context) {
        super(context);
        this.S = f41Var;
        this.R = new org.telegram.ui.l20();
    }

    @Override // vh.o, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.S.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        bw0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.R.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
