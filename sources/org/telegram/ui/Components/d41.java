package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d41 extends ih.s {
    @Override // ih.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        cw0.a(canvas, getLayout());
        canvas.restore();
    }
}
