package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yx0 extends ac0 {
    public final /* synthetic */ zx0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(zx0 zx0Var, Context context) {
        super(13, context, null);
        this.y0 = zx0Var;
    }

    @Override // org.telegram.ui.Components.ac0, android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
        zx0 zx0Var = this.y0;
        if (x02 != zx0Var.a) {
            zx0Var.a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.i0.L(31.0f);
        zx0Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h7, false));
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), L, zx0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), measuredHeight, zx0Var.e);
    }
}
