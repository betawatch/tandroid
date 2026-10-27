package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p51 extends xh.n {
    @Override // xh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        ix0.a(canvas, getLayout());
        canvas.restore();
    }
}
