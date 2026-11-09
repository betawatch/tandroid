package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.ox0 {
    public final /* synthetic */ zs0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(zs0 zs0Var, Context context, di.n6 n6Var, yp0 yp0Var) {
        super(context, n6Var, yp0Var);
        this.x = zs0Var;
    }

    @Override // org.telegram.ui.ox0
    public final void b() {
        dq0 dq0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        zs0 zs0Var = this.x;
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr != null) {
            for (ur0 ur0Var : ur0VarArr) {
                if (ur0Var != null && (dq0Var = ur0Var.h) != null) {
                    int paddingTop = dq0Var.getPaddingTop();
                    dq0 dq0Var2 = ur0Var.h;
                    int paddingLeft = dq0Var2.getPaddingLeft();
                    int j02 = zs0Var.j0(ur0Var.E);
                    int paddingRight = ur0Var.h.getPaddingRight();
                    dq0 dq0Var3 = ur0Var.h;
                    int i02 = zs0Var.i0(zs0Var.I0());
                    dq0Var3.h3 = i02;
                    dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - ur0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(ur0Var.h, new cp0(ur0Var, paddingTop2, 2));
                    }
                }
                if (ur0Var != null && ur0Var.s != null) {
                    zs0Var.K1(ur0Var);
                }
            }
        }
        zs0Var.U();
    }
}
