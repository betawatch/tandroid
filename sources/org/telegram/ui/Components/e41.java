package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e41 extends vh.o {
    @Override // vh.o, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        cw0.a(canvas, getLayout());
        canvas.restore();
    }
}
