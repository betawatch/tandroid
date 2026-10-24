package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ss0 extends org.telegram.ui.i11 {
    public final /* synthetic */ xv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(xv0 xv0Var, Context context, ow0 ow0Var, ci.v6 v6Var, rs0 rs0Var) {
        super(context, ow0Var, v6Var, rs0Var);
        this.H = xv0Var;
    }

    @Override // org.telegram.ui.i11
    public final void b() {
        ws0 ws0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        xv0 xv0Var = this.H;
        qu0[] qu0VarArr = xv0Var.k0;
        if (qu0VarArr != null) {
            for (qu0 qu0Var : qu0VarArr) {
                if (qu0Var != null && (ws0Var = qu0Var.h) != null) {
                    int paddingTop = ws0Var.getPaddingTop();
                    ws0 ws0Var2 = qu0Var.h;
                    int paddingLeft = ws0Var2.getPaddingLeft();
                    int a02 = xv0Var.a0(qu0Var.F);
                    int paddingRight = qu0Var.h.getPaddingRight();
                    ws0 ws0Var3 = qu0Var.h;
                    int Z = xv0Var.Z(xv0Var.y0());
                    ws0Var3.f3 = Z;
                    ws0Var2.setPadding(paddingLeft, a02, paddingRight, Z);
                    int paddingTop2 = paddingTop - qu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(qu0Var.h, new zr0(qu0Var, paddingTop2, 1));
                    }
                }
                if (qu0Var != null && qu0Var.v != null) {
                    xv0Var.v1(qu0Var);
                }
            }
        }
        xv0Var.L();
    }
}
