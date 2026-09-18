package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nn0 extends View {
    public Paint a;
    public Paint b;
    public float c;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
    }
}
