package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yp0 extends org.telegram.ui.kx0 {
    public final /* synthetic */ xs0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(xs0 xs0Var, Context context, di.m6 m6Var, xp0 xp0Var) {
        super(context, m6Var, xp0Var);
        this.x = xs0Var;
    }

    @Override // org.telegram.ui.kx0
    public final void b() {
        cq0 cq0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        xs0 xs0Var = this.x;
        sr0[] sr0VarArr = xs0Var.m0;
        if (sr0VarArr != null) {
            for (sr0 sr0Var : sr0VarArr) {
                if (sr0Var != null && (cq0Var = sr0Var.h) != null) {
                    int paddingTop = cq0Var.getPaddingTop();
                    cq0 cq0Var2 = sr0Var.h;
                    int paddingLeft = cq0Var2.getPaddingLeft();
                    int j02 = xs0Var.j0(sr0Var.E);
                    int paddingRight = sr0Var.h.getPaddingRight();
                    cq0 cq0Var3 = sr0Var.h;
                    int i02 = xs0Var.i0(xs0Var.H0());
                    cq0Var3.h3 = i02;
                    cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - sr0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(sr0Var.h, new bp0(sr0Var, paddingTop2, 2));
                    }
                }
                if (sr0Var != null && sr0Var.s != null) {
                    xs0Var.I1(sr0Var);
                }
            }
        }
        xs0Var.U();
    }
}
