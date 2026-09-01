package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tr0 extends org.telegram.ui.m11 {
    public final /* synthetic */ zu0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(zu0 zu0Var, Context context, qv0 qv0Var, oh.h6 h6Var, sr0 sr0Var) {
        super(context, qv0Var, h6Var, sr0Var);
        this.E = zu0Var;
    }

    @Override // org.telegram.ui.m11
    public final void a() {
        xr0 xr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.C;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        zu0 zu0Var = this.E;
        rt0[] rt0VarArr = zu0Var.h0;
        if (rt0VarArr != null) {
            for (rt0 rt0Var : rt0VarArr) {
                if (rt0Var != null && (xr0Var = rt0Var.h) != null) {
                    int paddingLeft = xr0Var.getPaddingLeft();
                    int Z = zu0Var.Z(rt0Var.C);
                    int paddingRight = rt0Var.h.getPaddingRight();
                    xr0 xr0Var2 = rt0Var.h;
                    int Y = zu0Var.Y(zu0Var.v0());
                    xr0Var2.b3 = Y;
                    xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        zu0Var.K();
    }
}
