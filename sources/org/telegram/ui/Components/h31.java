package org.telegram.ui.Components;

import android.graphics.Canvas;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h31 extends dh.u {
    @Override // dh.u, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        jv0.a(canvas, getLayout());
        canvas.restore();
    }
}
