package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.a21 {
    public final /* synthetic */ kv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(kv0 kv0Var, Context context, bw0 bw0Var, ai.x8 x8Var, ds0 ds0Var) {
        super(context, bw0Var, x8Var, ds0Var);
        this.H = kv0Var;
    }

    @Override // org.telegram.ui.a21
    public final void a() {
        js0 js0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        kv0 kv0Var = this.H;
        du0[] du0VarArr = kv0Var.k0;
        if (du0VarArr != null) {
            for (du0 du0Var : du0VarArr) {
                if (du0Var != null && (js0Var = du0Var.h) != null) {
                    int paddingLeft = js0Var.getPaddingLeft();
                    int Z = kv0Var.Z(du0Var.F);
                    int paddingRight = du0Var.h.getPaddingRight();
                    js0 js0Var2 = du0Var.h;
                    int Y = kv0Var.Y(kv0Var.v0());
                    js0Var2.e3 = Y;
                    js0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        kv0Var.K();
    }
}
