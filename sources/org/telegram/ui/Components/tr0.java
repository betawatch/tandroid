package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tr0 extends org.telegram.ui.c21 {
    public final /* synthetic */ yu0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(yu0 yu0Var, Context context, pv0 pv0Var, ai.x8 x8Var, rr0 rr0Var) {
        super(context, pv0Var, x8Var, rr0Var);
        this.H = yu0Var;
    }

    @Override // org.telegram.ui.c21
    public final void a() {
        xr0 xr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        yu0 yu0Var = this.H;
        rt0[] rt0VarArr = yu0Var.k0;
        if (rt0VarArr != null) {
            for (rt0 rt0Var : rt0VarArr) {
                if (rt0Var != null && (xr0Var = rt0Var.h) != null) {
                    int paddingLeft = xr0Var.getPaddingLeft();
                    int Z = yu0Var.Z(rt0Var.F);
                    int paddingRight = rt0Var.h.getPaddingRight();
                    xr0 xr0Var2 = rt0Var.h;
                    int Y = yu0Var.Y(yu0Var.v0());
                    xr0Var2.e3 = Y;
                    xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        yu0Var.K();
    }
}
