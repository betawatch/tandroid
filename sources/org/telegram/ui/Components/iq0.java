package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.lx0 {
    public final /* synthetic */ it0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(it0 it0Var, Context context, fi.d6 d6Var, hq0 hq0Var) {
        super(context, d6Var, hq0Var);
        this.x = it0Var;
    }

    @Override // org.telegram.ui.lx0
    public final void b() {
        mq0 mq0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        it0 it0Var = this.x;
        ds0[] ds0VarArr = it0Var.n0;
        if (ds0VarArr != null) {
            for (ds0 ds0Var : ds0VarArr) {
                if (ds0Var != null && (mq0Var = ds0Var.h) != null) {
                    int paddingTop = mq0Var.getPaddingTop();
                    mq0 mq0Var2 = ds0Var.h;
                    int paddingLeft = mq0Var2.getPaddingLeft();
                    int j02 = it0Var.j0(ds0Var.F);
                    int paddingRight = ds0Var.h.getPaddingRight();
                    mq0 mq0Var3 = ds0Var.h;
                    int i02 = it0Var.i0(it0Var.I0());
                    mq0Var3.i3 = i02;
                    mq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - ds0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(ds0Var.h, new pp0(ds0Var, paddingTop2, 2));
                    }
                }
                if (ds0Var != null && ds0Var.s != null) {
                    it0Var.K1(ds0Var);
                }
            }
        }
        it0Var.U();
    }
}
