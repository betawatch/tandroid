package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gs0 extends org.telegram.ui.a21 {
    public final /* synthetic */ lv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(lv0 lv0Var, Context context, cw0 cw0Var, ai.x8 x8Var, fs0 fs0Var) {
        super(context, cw0Var, x8Var, fs0Var);
        this.H = lv0Var;
    }

    @Override // org.telegram.ui.a21
    public final void a() {
        ks0 ks0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        lv0 lv0Var = this.H;
        eu0[] eu0VarArr = lv0Var.k0;
        if (eu0VarArr != null) {
            for (eu0 eu0Var : eu0VarArr) {
                if (eu0Var != null && (ks0Var = eu0Var.h) != null) {
                    int paddingLeft = ks0Var.getPaddingLeft();
                    int Z = lv0Var.Z(eu0Var.F);
                    int paddingRight = eu0Var.h.getPaddingRight();
                    ks0 ks0Var2 = eu0Var.h;
                    int Y = lv0Var.Y(lv0Var.v0());
                    ks0Var2.e3 = Y;
                    ks0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        lv0Var.K();
    }
}
