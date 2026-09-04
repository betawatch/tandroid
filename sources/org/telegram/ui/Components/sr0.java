package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class sr0 extends org.telegram.ui.d21 {
    public final /* synthetic */ xu0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(xu0 xu0Var, Context context, ov0 ov0Var, bi.f8 f8Var, rr0 rr0Var) {
        super(context, ov0Var, f8Var, rr0Var);
        this.H = xu0Var;
    }

    @Override // org.telegram.ui.d21
    public final void a() {
        wr0 wr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        xu0 xu0Var = this.H;
        qt0[] qt0VarArr = xu0Var.k0;
        if (qt0VarArr != null) {
            for (qt0 qt0Var : qt0VarArr) {
                if (qt0Var != null && (wr0Var = qt0Var.h) != null) {
                    int paddingLeft = wr0Var.getPaddingLeft();
                    int Z = xu0Var.Z(qt0Var.F);
                    int paddingRight = qt0Var.h.getPaddingRight();
                    wr0 wr0Var2 = qt0Var.h;
                    int Y = xu0Var.Y(xu0Var.v0());
                    wr0Var2.e3 = Y;
                    wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        xu0Var.K();
    }
}
