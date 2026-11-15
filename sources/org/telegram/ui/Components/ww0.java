package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ww0 extends ib0 {
    public final /* synthetic */ xw0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(xw0 xw0Var, Context context) {
        super(13, context, null);
        this.z0 = xw0Var;
    }

    @Override // org.telegram.ui.Components.ib0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false);
        xw0 xw0Var = this.z0;
        if (x02 != xw0Var.a) {
            xw0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        xw0Var.e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, xw0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, xw0Var.e);
    }
}
