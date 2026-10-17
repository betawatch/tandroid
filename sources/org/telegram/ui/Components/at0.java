package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class at0 extends b10 {
    public final /* synthetic */ os0 U;
    public final /* synthetic */ sv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(sv0 sv0Var, Context context, os0 os0Var) {
        super(context, null);
        this.V = sv0Var;
        this.U = os0Var;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getColumnsCount() {
        return this.V.m1[sv0.q0(this.U.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.b10
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
                } else if (sv0.q0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.b10, android.view.View
    public final void onDraw(Canvas canvas) {
        sv0 sv0Var = this.V;
        sv0Var.T0.setColor(sv0Var.i0(org.telegram.ui.ActionBar.h6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), sv0Var.T0);
        super.onDraw(canvas);
    }
}
