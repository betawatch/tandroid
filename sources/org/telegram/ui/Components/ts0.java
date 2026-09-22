package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ts0 extends t00 {
    public final /* synthetic */ hs0 U;
    public final /* synthetic */ lv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(lv0 lv0Var, Context context, hs0 hs0Var) {
        super(context, null);
        this.V = lv0Var;
        this.U = hs0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getColumnsCount() {
        return this.V.m1[lv0.p0(this.U.F) ? 1 : 0];
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
                } else if (lv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public final void onDraw(Canvas canvas) {
        lv0 lv0Var = this.V;
        lv0Var.T0.setColor(lv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), lv0Var.T0);
        super.onDraw(canvas);
    }
}
