package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g31 extends dh.u {
    public final org.telegram.ui.s10 N;
    public final /* synthetic */ j31 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g31(j31 j31Var, Context context) {
        super(context);
        this.O = j31Var;
        this.N = new org.telegram.ui.s10();
    }

    @Override // dh.u, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(8.0f) + this.O.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - dp, getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        jv0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - dp, getHeight());
        this.N.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
