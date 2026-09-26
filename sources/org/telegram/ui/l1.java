package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class l1 extends View {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, i4.r1);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(4.0f) + 1);
    }
}
