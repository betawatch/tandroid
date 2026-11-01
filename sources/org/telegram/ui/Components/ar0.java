package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ar0 extends org.telegram.ui.yy0 {
    public final /* synthetic */ au0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(au0 au0Var, Context context, th.t4 t4Var, zq0 zq0Var) {
        super(context, t4Var, zq0Var);
        this.x = au0Var;
    }

    @Override // org.telegram.ui.yy0
    public final void b() {
        er0 er0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        au0 au0Var = this.x;
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr != null) {
            for (ts0 ts0Var : ts0VarArr) {
                if (ts0Var != null && (er0Var = ts0Var.h) != null) {
                    int paddingTop = er0Var.getPaddingTop();
                    er0 er0Var2 = ts0Var.h;
                    int paddingLeft = er0Var2.getPaddingLeft();
                    int i02 = au0Var.i0(ts0Var.E);
                    int paddingRight = ts0Var.h.getPaddingRight();
                    er0 er0Var3 = ts0Var.h;
                    int h02 = au0Var.h0(au0Var.F0());
                    er0Var3.h3 = h02;
                    er0Var2.setPadding(paddingLeft, i02, paddingRight, h02);
                    int paddingTop2 = paddingTop - ts0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.i0.J(ts0Var.h, new eq0(ts0Var, paddingTop2, 2));
                    }
                }
                if (ts0Var != null && ts0Var.s != null) {
                    au0Var.G1(ts0Var);
                }
            }
        }
        au0Var.T();
    }
}
