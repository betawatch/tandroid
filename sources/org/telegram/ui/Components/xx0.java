package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xx0 extends ac0 {
    public final /* synthetic */ yx0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0(yx0 yx0Var, Context context) {
        super(13, context, null);
        this.y0 = yx0Var;
    }

    @Override // org.telegram.ui.Components.ac0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
        yx0 yx0Var = this.y0;
        if (x02 != yx0Var.a) {
            yx0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.i0.L(31.0f);
        yx0Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h7, false));
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), L, yx0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), measuredHeight, yx0Var.e);
    }
}
