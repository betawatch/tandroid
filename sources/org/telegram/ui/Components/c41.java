package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
