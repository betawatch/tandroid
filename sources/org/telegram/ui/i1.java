package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i1 extends View {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, g4.s1);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(4.0f) + 1);
    }
}
