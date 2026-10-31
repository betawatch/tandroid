package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zq0 extends org.telegram.ui.zy0 {
    public final /* synthetic */ zt0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(zt0 zt0Var, Context context, th.t4 t4Var, yq0 yq0Var) {
        super(context, t4Var, yq0Var);
        this.x = zt0Var;
    }

    @Override // org.telegram.ui.zy0
    public final void b() {
        dr0 dr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        zt0 zt0Var = this.x;
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr != null) {
            for (ss0 ss0Var : ss0VarArr) {
                if (ss0Var != null && (dr0Var = ss0Var.h) != null) {
                    int paddingTop = dr0Var.getPaddingTop();
                    dr0 dr0Var2 = ss0Var.h;
                    int paddingLeft = dr0Var2.getPaddingLeft();
                    int h02 = zt0Var.h0(ss0Var.E);
                    int paddingRight = ss0Var.h.getPaddingRight();
                    dr0 dr0Var3 = ss0Var.h;
                    int g02 = zt0Var.g0(zt0Var.E0());
                    dr0Var3.h3 = g02;
                    dr0Var2.setPadding(paddingLeft, h02, paddingRight, g02);
                    int paddingTop2 = paddingTop - ss0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.i0.J(ss0Var.h, new dq0(ss0Var, paddingTop2, 2));
                    }
                }
                if (ss0Var != null && ss0Var.s != null) {
                    zt0Var.F1(ss0Var);
                }
            }
        }
        zt0Var.S();
    }
}
