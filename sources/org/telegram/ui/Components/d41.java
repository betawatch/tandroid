package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d41 extends vh.o {
    @Override // vh.o, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        bw0.a(canvas, getLayout());
        canvas.restore();
    }
}
