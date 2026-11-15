package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w21 extends xh.l {
    public final h6.m V;
    public final /* synthetic */ z21 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(z21 z21Var, Context context) {
        super(context);
        this.W = z21Var;
        this.V = new h6.m(29);
    }

    @Override // xh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), org.telegram.messenger.ns.e4, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        fu0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.g0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
