package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ft0 extends b10 {
    public final /* synthetic */ ts0 U;
    public final /* synthetic */ xv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(xv0 xv0Var, Context context, ts0 ts0Var) {
        super(context, null);
        this.V = xv0Var;
        this.U = ts0Var;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getColumnsCount() {
        return this.V.m1[xv0.r0(this.U.F) ? 1 : 0];
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
                } else if (xv0.r0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.b10, android.view.View
    public final void onDraw(Canvas canvas) {
        xv0 xv0Var = this.V;
        xv0Var.T0.setColor(xv0Var.j0(org.telegram.ui.ActionBar.k6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), xv0Var.T0);
        super.onDraw(canvas);
    }
}
