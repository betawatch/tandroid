package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c41 extends wh.p {
    @Override // wh.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        aw0.a(canvas, getLayout());
        canvas.restore();
    }
}
