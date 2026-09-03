package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m1 extends View {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, l4.o1);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(4.0f) + 1);
    }
}
