package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class q41 extends vh.n {
    @Override // vh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        mw0.a(canvas, getLayout());
        canvas.restore();
    }
}
