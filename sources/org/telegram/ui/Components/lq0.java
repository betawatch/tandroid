package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lq0 extends iz {
    public final /* synthetic */ zp0 V;
    public final /* synthetic */ ws0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(ws0 ws0Var, Context context, zp0 zp0Var) {
        super(context, null);
        this.W = ws0Var;
        this.V = zp0Var;
    }

    @Override // org.telegram.ui.Components.iz
    public final int getColumnsCount() {
        return this.W.p1[ws0.z0(this.V.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.iz
    public final int getViewType() {
        setIsSingleCell(false);
        int i3 = this.V.F;
        if (i3 == 0 || i3 == 5) {
            return 2;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 != 2 && i3 != 4) {
            if (i3 == 3) {
                return 5;
            }
            if (i3 != 7) {
                if (i3 == 6) {
                    if (this.W.L0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (ws0.z0(i3)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.iz, android.view.View
    public final void onDraw(Canvas canvas) {
        ws0 ws0Var = this.W;
        ws0Var.W0.setColor(ws0Var.s0(org.telegram.ui.ActionBar.k6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ws0Var.W0);
        super.onDraw(canvas);
    }
}
