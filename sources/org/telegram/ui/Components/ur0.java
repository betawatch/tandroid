package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ur0 extends org.telegram.ui.c21 {
    public final /* synthetic */ zu0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(zu0 zu0Var, Context context, qv0 qv0Var, ai.x8 x8Var, sr0 sr0Var) {
        super(context, qv0Var, x8Var, sr0Var);
        this.H = zu0Var;
    }

    @Override // org.telegram.ui.c21
    public final void a() {
        yr0 yr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        zu0 zu0Var = this.H;
        st0[] st0VarArr = zu0Var.k0;
        if (st0VarArr != null) {
            for (st0 st0Var : st0VarArr) {
                if (st0Var != null && (yr0Var = st0Var.h) != null) {
                    int paddingLeft = yr0Var.getPaddingLeft();
                    int Z = zu0Var.Z(st0Var.F);
                    int paddingRight = st0Var.h.getPaddingRight();
                    yr0 yr0Var2 = st0Var.h;
                    int Y = zu0Var.Y(zu0Var.v0());
                    yr0Var2.e3 = Y;
                    yr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        zu0Var.K();
    }
}
