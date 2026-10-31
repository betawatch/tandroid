package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t31 extends nh.p {
    public final li.k U;
    public final /* synthetic */ w31 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t31(w31 w31Var, Context context) {
        super(context);
        this.V = w31Var;
        this.U = new li.k(23);
    }

    @Override // nh.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(8.0f) + this.V.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), org.telegram.messenger.zs.e4, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        gv0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.i0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.U.o(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
