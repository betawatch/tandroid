package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ps0 extends a10 {
    public final /* synthetic */ ds0 U;
    public final /* synthetic */ iv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(iv0 iv0Var, Context context, ds0 ds0Var) {
        super(context, null);
        this.V = iv0Var;
        this.U = ds0Var;
    }

    @Override // org.telegram.ui.Components.a10
    public final int getColumnsCount() {
        return this.V.m1[iv0.p0(this.U.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.a10
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
                } else if (iv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.a10, android.view.View
    public final void onDraw(Canvas canvas) {
        iv0 iv0Var = this.V;
        iv0Var.T0.setColor(iv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), iv0Var.T0);
        super.onDraw(canvas);
    }
}
