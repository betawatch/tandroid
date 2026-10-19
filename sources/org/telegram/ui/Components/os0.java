package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class os0 extends org.telegram.ui.e11 {
    public final /* synthetic */ tv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(tv0 tv0Var, Context context, kw0 kw0Var, ci.w6 w6Var, ns0 ns0Var) {
        super(context, kw0Var, w6Var, ns0Var);
        this.H = tv0Var;
    }

    @Override // org.telegram.ui.e11
    public final void b() {
        ss0 ss0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        tv0 tv0Var = this.H;
        mu0[] mu0VarArr = tv0Var.k0;
        if (mu0VarArr != null) {
            for (mu0 mu0Var : mu0VarArr) {
                if (mu0Var != null && (ss0Var = mu0Var.h) != null) {
                    int paddingTop = ss0Var.getPaddingTop();
                    ss0 ss0Var2 = mu0Var.h;
                    int paddingLeft = ss0Var2.getPaddingLeft();
                    int Z = tv0Var.Z(mu0Var.F);
                    int paddingRight = mu0Var.h.getPaddingRight();
                    ss0 ss0Var3 = mu0Var.h;
                    int Y = tv0Var.Y(tv0Var.x0());
                    ss0Var3.c3 = Y;
                    ss0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
                    int paddingTop2 = paddingTop - mu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(mu0Var.h, new vr0(mu0Var, paddingTop2, 1));
                    }
                }
                if (mu0Var != null && mu0Var.v != null) {
                    tv0Var.t1(mu0Var);
                }
            }
        }
        tv0Var.K();
    }
}
