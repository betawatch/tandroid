package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.jx0 {
    public final /* synthetic */ ys0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(ys0 ys0Var, Context context, fi.g6 g6Var, yp0 yp0Var) {
        super(context, g6Var, yp0Var);
        this.x = ys0Var;
    }

    @Override // org.telegram.ui.jx0
    public final void b() {
        dq0 dq0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        ys0 ys0Var = this.x;
        tr0[] tr0VarArr = ys0Var.n0;
        if (tr0VarArr != null) {
            for (tr0 tr0Var : tr0VarArr) {
                if (tr0Var != null && (dq0Var = tr0Var.h) != null) {
                    int paddingTop = dq0Var.getPaddingTop();
                    dq0 dq0Var2 = tr0Var.h;
                    int paddingLeft = dq0Var2.getPaddingLeft();
                    int j02 = ys0Var.j0(tr0Var.F);
                    int paddingRight = tr0Var.h.getPaddingRight();
                    dq0 dq0Var3 = tr0Var.h;
                    int i02 = ys0Var.i0(ys0Var.I0());
                    dq0Var3.i3 = i02;
                    dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - tr0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(tr0Var.h, new ep0(tr0Var, paddingTop2, 2));
                    }
                }
                if (tr0Var != null && tr0Var.s != null) {
                    ys0Var.K1(tr0Var);
                }
            }
        }
        ys0Var.U();
    }
}
