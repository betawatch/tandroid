package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j31 extends eh.s {
    @Override // eh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        lv0.a(canvas, getLayout());
        canvas.restore();
    }
}
