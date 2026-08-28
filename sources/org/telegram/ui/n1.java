package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n1 extends View {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, l4.n1);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(4.0f) + 1);
    }
}
