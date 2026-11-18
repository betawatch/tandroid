package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g31 extends xh.l {
    public final h6.m V;
    public final /* synthetic */ j31 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g31(j31 j31Var, Context context) {
        super(context);
        this.W = j31Var;
        this.V = new h6.m(29);
    }

    @Override // xh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), org.telegram.messenger.ks.e4, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        nu0.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - L) - org.telegram.messenger.g0.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.n(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
