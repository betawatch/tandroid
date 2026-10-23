package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class lw0 extends sg.r1 {
    public final /* synthetic */ mw0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(mw0 mw0Var, Context context) {
        super(context);
        this.N = mw0Var;
    }

    @Override // sg.r1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            mw0 mw0Var = this.N;
            mw0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, mw0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), mw0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
