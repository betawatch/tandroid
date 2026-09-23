package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c41 extends vh.o {
    @Override // vh.o, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        bw0.a(canvas, getLayout());
        canvas.restore();
    }
}
