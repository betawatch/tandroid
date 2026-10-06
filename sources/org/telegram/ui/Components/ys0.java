package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ys0 extends w00 {
    public final /* synthetic */ ms0 U;
    public final /* synthetic */ qv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(qv0 qv0Var, Context context, ms0 ms0Var) {
        super(context, null);
        this.V = qv0Var;
        this.U = ms0Var;
    }

    @Override // org.telegram.ui.Components.w00
    public final int getColumnsCount() {
        return this.V.m1[qv0.p0(this.U.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.w00
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
                } else if (qv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.w00, android.view.View
    public final void onDraw(Canvas canvas) {
        qv0 qv0Var = this.V;
        qv0Var.T0.setColor(qv0Var.h0(org.telegram.ui.ActionBar.i6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qv0Var.T0);
        super.onDraw(canvas);
    }
}
