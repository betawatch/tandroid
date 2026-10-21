package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.e11 {
    public final /* synthetic */ uv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(uv0 uv0Var, Context context, lw0 lw0Var, ci.w6 w6Var, os0 os0Var) {
        super(context, lw0Var, w6Var, os0Var);
        this.H = uv0Var;
    }

    @Override // org.telegram.ui.e11
    public final void b() {
        ts0 ts0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        uv0 uv0Var = this.H;
        nu0[] nu0VarArr = uv0Var.k0;
        if (nu0VarArr != null) {
            for (nu0 nu0Var : nu0VarArr) {
                if (nu0Var != null && (ts0Var = nu0Var.h) != null) {
                    int paddingTop = ts0Var.getPaddingTop();
                    ts0 ts0Var2 = nu0Var.h;
                    int paddingLeft = ts0Var2.getPaddingLeft();
                    int Z = uv0Var.Z(nu0Var.F);
                    int paddingRight = nu0Var.h.getPaddingRight();
                    ts0 ts0Var3 = nu0Var.h;
                    int Y = uv0Var.Y(uv0Var.x0());
                    ts0Var3.c3 = Y;
                    ts0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
                    int paddingTop2 = paddingTop - nu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(nu0Var.h, new wr0(nu0Var, paddingTop2, 1));
                    }
                }
                if (nu0Var != null && nu0Var.v != null) {
                    uv0Var.t1(nu0Var);
                }
            }
        }
        uv0Var.K();
    }
}
