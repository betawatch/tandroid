package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.Cells.l8 {
    public pn(Context context) {
        super(context);
    }

    @Override // org.telegram.ui.Cells.l8, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
    }
}
