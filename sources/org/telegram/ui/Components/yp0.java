package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yp0 extends org.telegram.ui.px0 {
    public final /* synthetic */ ys0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(ys0 ys0Var, Context context, di.n6 n6Var, xp0 xp0Var) {
        super(context, n6Var, xp0Var);
        this.x = ys0Var;
    }

    @Override // org.telegram.ui.px0
    public final void b() {
        cq0 cq0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        ys0 ys0Var = this.x;
        tr0[] tr0VarArr = ys0Var.m0;
        if (tr0VarArr != null) {
            for (tr0 tr0Var : tr0VarArr) {
                if (tr0Var != null && (cq0Var = tr0Var.h) != null) {
                    int paddingTop = cq0Var.getPaddingTop();
                    cq0 cq0Var2 = tr0Var.h;
                    int paddingLeft = cq0Var2.getPaddingLeft();
                    int j02 = ys0Var.j0(tr0Var.E);
                    int paddingRight = tr0Var.h.getPaddingRight();
                    cq0 cq0Var3 = tr0Var.h;
                    int i02 = ys0Var.i0(ys0Var.I0());
                    cq0Var3.h3 = i02;
                    cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - tr0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(tr0Var.h, new bp0(tr0Var, paddingTop2, 2));
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
