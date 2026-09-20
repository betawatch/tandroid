package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.a21 {
    public final /* synthetic */ jv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(jv0 jv0Var, Context context, aw0 aw0Var, ai.x8 x8Var, cs0 cs0Var) {
        super(context, aw0Var, x8Var, cs0Var);
        this.H = jv0Var;
    }

    @Override // org.telegram.ui.a21
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
