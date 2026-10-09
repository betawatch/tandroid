package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jt0 extends j10 {
    public final /* synthetic */ xs0 U;
    public final /* synthetic */ bw0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(bw0 bw0Var, Context context, xs0 xs0Var) {
        super(context, null);
        this.V = bw0Var;
        this.U = xs0Var;
    }

    @Override // org.telegram.ui.Components.j10
    public final int getColumnsCount() {
        return this.V.m1[bw0.p0(this.U.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.j10
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
                } else if (bw0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.j10, android.view.View
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var = this.V;
        bw0Var.T0.setColor(bw0Var.h0(org.telegram.ui.ActionBar.i6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), bw0Var.T0);
        super.onDraw(canvas);
    }
}
