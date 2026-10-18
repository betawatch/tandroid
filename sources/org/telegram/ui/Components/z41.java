package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class z41 extends wh.n {
    @Override // wh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        vw0.a(canvas, getLayout());
        canvas.restore();
    }
}
