package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r41 extends vh.o {
    @Override // vh.o, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        mw0.a(canvas, getLayout());
        canvas.restore();
    }
}
