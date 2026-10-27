package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class at0 extends org.telegram.ui.n11 {
    public final /* synthetic */ bw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(bw0 bw0Var, Context context, di.v6 v6Var, zs0 zs0Var) {
        super(context, v6Var, zs0Var);
        this.w = bw0Var;
    }

    @Override // org.telegram.ui.n11
    public final void b() {
        et0 et0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        bw0 bw0Var = this.w;
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr != null) {
            for (uu0 uu0Var : uu0VarArr) {
                if (uu0Var != null && (et0Var = uu0Var.h) != null) {
                    int paddingTop = et0Var.getPaddingTop();
                    et0 et0Var2 = uu0Var.h;
                    int paddingLeft = et0Var2.getPaddingLeft();
                    int g02 = bw0Var.g0(uu0Var.E);
                    int paddingRight = uu0Var.h.getPaddingRight();
                    et0 et0Var3 = uu0Var.h;
                    int f02 = bw0Var.f0(bw0Var.D0());
                    et0Var3.i3 = f02;
                    et0Var2.setPadding(paddingLeft, g02, paddingRight, f02);
                    int paddingTop2 = paddingTop - uu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(uu0Var.h, new fs0(uu0Var, paddingTop2, 2));
                    }
                }
                if (uu0Var != null && uu0Var.s != null) {
                    bw0Var.E1(uu0Var);
                }
            }
        }
        bw0Var.R();
    }
}
