package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ss0 extends t00 {
    public final /* synthetic */ gs0 U;
    public final /* synthetic */ kv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(kv0 kv0Var, Context context, gs0 gs0Var) {
        super(context, null);
        this.V = kv0Var;
        this.U = gs0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getColumnsCount() {
        return this.V.m1[kv0.p0(this.U.F) ? 1 : 0];
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
                } else if (kv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public final void onDraw(Canvas canvas) {
        kv0 kv0Var = this.V;
        kv0Var.T0.setColor(kv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), kv0Var.T0);
        super.onDraw(canvas);
    }
}
