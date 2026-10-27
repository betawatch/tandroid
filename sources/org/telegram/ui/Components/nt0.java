package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nt0 extends c10 {
    public final /* synthetic */ bt0 U;
    public final /* synthetic */ bw0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(bw0 bw0Var, Context context, bt0 bt0Var) {
        super(context, null);
        this.V = bw0Var;
        this.U = bt0Var;
    }

    @Override // org.telegram.ui.Components.c10
    public final int getColumnsCount() {
        return this.V.o1[bw0.w0(this.U.E) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.c10
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.U.E;
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
                    if (this.V.K0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (bw0.w0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.c10, android.view.View
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var = this.V;
        bw0Var.V0.setColor(bw0Var.p0(org.telegram.ui.ActionBar.y6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), bw0Var.V0);
        super.onDraw(canvas);
    }
}
