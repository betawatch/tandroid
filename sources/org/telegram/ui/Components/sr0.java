package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sr0 extends org.telegram.ui.q11 {
    public final /* synthetic */ yu0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(yu0 yu0Var, Context context, pv0 pv0Var, oh.h6 h6Var, rr0 rr0Var) {
        super(context, pv0Var, h6Var, rr0Var);
        this.E = yu0Var;
    }

    @Override // org.telegram.ui.q11
    public final void a() {
        wr0 wr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.C;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        yu0 yu0Var = this.E;
        qt0[] qt0VarArr = yu0Var.h0;
        if (qt0VarArr != null) {
            for (qt0 qt0Var : qt0VarArr) {
                if (qt0Var != null && (wr0Var = qt0Var.h) != null) {
                    int paddingLeft = wr0Var.getPaddingLeft();
                    int Z = yu0Var.Z(qt0Var.C);
                    int paddingRight = qt0Var.h.getPaddingRight();
                    wr0 wr0Var2 = qt0Var.h;
                    int Y = yu0Var.Y(yu0Var.v0());
                    wr0Var2.b3 = Y;
                    wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        yu0Var.K();
    }
}
