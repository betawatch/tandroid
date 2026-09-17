package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
