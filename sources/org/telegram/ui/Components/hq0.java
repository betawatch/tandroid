package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hq0 extends org.telegram.ui.nx0 {
    public final /* synthetic */ gt0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq0(gt0 gt0Var, Context context, fi.d6 d6Var, gq0 gq0Var) {
        super(context, d6Var, gq0Var);
        this.x = gt0Var;
    }

    @Override // org.telegram.ui.nx0
    public final void b() {
        lq0 lq0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        gt0 gt0Var = this.x;
        bs0[] bs0VarArr = gt0Var.n0;
        if (bs0VarArr != null) {
            for (bs0 bs0Var : bs0VarArr) {
                if (bs0Var != null && (lq0Var = bs0Var.h) != null) {
                    int paddingTop = lq0Var.getPaddingTop();
                    lq0 lq0Var2 = bs0Var.h;
                    int paddingLeft = lq0Var2.getPaddingLeft();
                    int j02 = gt0Var.j0(bs0Var.F);
                    int paddingRight = bs0Var.h.getPaddingRight();
                    lq0 lq0Var3 = bs0Var.h;
                    int i02 = gt0Var.i0(gt0Var.I0());
                    lq0Var3.i3 = i02;
                    lq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - bs0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(bs0Var.h, new op0(bs0Var, paddingTop2, 2));
                    }
                }
                if (bs0Var != null && bs0Var.s != null) {
                    gt0Var.K1(bs0Var);
                }
            }
        }
        gt0Var.U();
    }
}
