package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gs0 extends u00 {
    public final /* synthetic */ ur0 R;
    public final /* synthetic */ zu0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(zu0 zu0Var, Context context, ur0 ur0Var) {
        super(context, null);
        this.S = zu0Var;
        this.R = ur0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        return this.S.j1[zu0.p0(this.R.C) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.u00
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.R.C;
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
                    if (this.S.F0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (zu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.u00, android.view.View
    public final void onDraw(Canvas canvas) {
        zu0 zu0Var = this.S;
        zu0Var.Q0.setColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zu0Var.Q0);
        super.onDraw(canvas);
    }
}
