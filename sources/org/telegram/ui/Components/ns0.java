package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ns0 extends org.telegram.ui.g11 {
    public final /* synthetic */ sv0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(sv0 sv0Var, Context context, jw0 jw0Var, ci.w6 w6Var, ms0 ms0Var) {
        super(context, jw0Var, w6Var, ms0Var);
        this.H = sv0Var;
    }

    @Override // org.telegram.ui.g11
    public final void b() {
        rs0 rs0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.F;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        sv0 sv0Var = this.H;
        lu0[] lu0VarArr = sv0Var.k0;
        if (lu0VarArr != null) {
            for (lu0 lu0Var : lu0VarArr) {
                if (lu0Var != null && (rs0Var = lu0Var.h) != null) {
                    int paddingTop = rs0Var.getPaddingTop();
                    rs0 rs0Var2 = lu0Var.h;
                    int paddingLeft = rs0Var2.getPaddingLeft();
                    int Z = sv0Var.Z(lu0Var.F);
                    int paddingRight = lu0Var.h.getPaddingRight();
                    rs0 rs0Var3 = lu0Var.h;
                    int Y = sv0Var.Y(sv0Var.x0());
                    rs0Var3.c3 = Y;
                    rs0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
                    int paddingTop2 = paddingTop - lu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(lu0Var.h, new ur0(lu0Var, paddingTop2, 1));
                    }
                }
                if (lu0Var != null && lu0Var.v != null) {
                    sv0Var.t1(lu0Var);
                }
            }
        }
        sv0Var.K();
    }
}
