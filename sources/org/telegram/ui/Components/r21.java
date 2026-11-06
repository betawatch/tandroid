package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class r21 extends xh.l {
    public final h6.m U;
    public final /* synthetic */ u21 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(u21 u21Var, Context context) {
        super(context);
        this.V = u21Var;
        this.U = new h6.m(28);
    }

    @Override // xh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(8.0f) + this.V.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), org.telegram.messenger.qs.e4, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        eu0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.g0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.U.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
