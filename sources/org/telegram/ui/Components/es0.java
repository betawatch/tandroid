package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.s11 {
    public final /* synthetic */ jv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(jv0 jv0Var, Context context, aw0 aw0Var, ai.x8 x8Var, ds0 ds0Var) {
        super(context, aw0Var, x8Var, ds0Var);
        this.H = jv0Var;
    }

    @Override // org.telegram.ui.s11
    public final void a() {
        is0 is0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        jv0 jv0Var = this.H;
        cu0[] cu0VarArr = jv0Var.k0;
        if (cu0VarArr != null) {
            for (cu0 cu0Var : cu0VarArr) {
                if (cu0Var != null && (is0Var = cu0Var.h) != null) {
                    int paddingLeft = is0Var.getPaddingLeft();
                    int Z = jv0Var.Z(cu0Var.F);
                    int paddingRight = cu0Var.h.getPaddingRight();
                    is0 is0Var2 = cu0Var.h;
                    int Y = jv0Var.Y(jv0Var.v0());
                    is0Var2.e3 = Y;
                    is0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        jv0Var.K();
    }
}
