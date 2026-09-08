package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fs0 extends t00 {
    public final /* synthetic */ tr0 U;
    public final /* synthetic */ xu0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(xu0 xu0Var, Context context, tr0 tr0Var) {
        super(context, null);
        this.V = xu0Var;
        this.U = tr0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getColumnsCount() {
        return this.V.m1[xu0.p0(this.U.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.t00
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
                } else if (xu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public final void onDraw(Canvas canvas) {
        xu0 xu0Var = this.V;
        xu0Var.T0.setColor(xu0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), xu0Var.T0);
        super.onDraw(canvas);
    }
}
