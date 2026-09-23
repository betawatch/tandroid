package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gs0 extends u00 {
    public final /* synthetic */ ur0 U;
    public final /* synthetic */ yu0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(yu0 yu0Var, Context context, ur0 ur0Var) {
        super(context, null);
        this.V = yu0Var;
        this.U = ur0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        return this.V.m1[yu0.p0(this.U.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.u00
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.U.F;
        if (i10 == 0 || i10 == 5) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 != 2 && i10 != 4) {
            if (i10 == 3) {
                return 5;
            }
            if (i10 != 7) {
                if (i10 == 6) {
                    if (this.V.I0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (yu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.u00, android.view.View
    public final void onDraw(Canvas canvas) {
        yu0 yu0Var = this.V;
        yu0Var.T0.setColor(yu0Var.h0(org.telegram.ui.ActionBar.h6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yu0Var.T0);
        super.onDraw(canvas);
    }
}
