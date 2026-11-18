package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dx0 extends sb0 {
    public final /* synthetic */ ex0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(ex0 ex0Var, Context context) {
        super(13, context, null);
        this.z0 = ex0Var;
    }

    @Override // org.telegram.ui.Components.sb0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.j5, false);
        ex0 ex0Var = this.z0;
        if (x02 != ex0Var.a) {
            ex0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        ex0Var.e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, ex0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, ex0Var.e);
    }
}
