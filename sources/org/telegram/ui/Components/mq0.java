package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mq0 extends lz {
    public final /* synthetic */ zp0 U;
    public final /* synthetic */ ys0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq0(ys0 ys0Var, Context context, zp0 zp0Var) {
        super(context, null);
        this.V = ys0Var;
        this.U = zp0Var;
    }

    @Override // org.telegram.ui.Components.lz
    public final int getColumnsCount() {
        return this.V.o1[ys0.z0(this.U.E) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.lz
    public final int getViewType() {
        setIsSingleCell(false);
        int i7 = this.U.E;
        if (i7 == 0 || i7 == 5) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 != 2 && i7 != 4) {
            if (i7 == 3) {
                return 5;
            }
            if (i7 != 7) {
                if (i7 == 6) {
                    if (this.V.K0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (ys0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.lz, android.view.View
    public final void onDraw(Canvas canvas) {
        ys0 ys0Var = this.V;
        ys0Var.V0.setColor(ys0Var.s0(org.telegram.ui.ActionBar.m6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ys0Var.V0);
        super.onDraw(canvas);
    }
}
