package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mo extends org.telegram.ui.Cells.p8 {
    public mo(Context context) {
        super(context);
    }

    @Override // org.telegram.ui.Cells.p8, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
    }
}
