package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ss0 extends org.telegram.ui.h21 {
    public final /* synthetic */ xv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(xv0 xv0Var, Context context, ow0 ow0Var, bi.i8 i8Var, rs0 rs0Var) {
        super(context, ow0Var, i8Var, rs0Var);
        this.H = xv0Var;
    }

    @Override // org.telegram.ui.h21
    public final void a() {
        ws0 ws0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        xv0 xv0Var = this.H;
        qu0[] qu0VarArr = xv0Var.k0;
        if (qu0VarArr != null) {
            for (qu0 qu0Var : qu0VarArr) {
                if (qu0Var != null && (ws0Var = qu0Var.h) != null) {
                    int paddingLeft = ws0Var.getPaddingLeft();
                    int Z = xv0Var.Z(qu0Var.F);
                    int paddingRight = qu0Var.h.getPaddingRight();
                    ws0 ws0Var2 = qu0Var.h;
                    int Y = xv0Var.Y(xv0Var.v0());
                    ws0Var2.c3 = Y;
                    ws0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        xv0Var.K();
    }
}
