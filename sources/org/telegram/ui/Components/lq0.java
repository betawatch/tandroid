package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lq0 extends mz {
    public final /* synthetic */ zp0 U;
    public final /* synthetic */ xs0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(xs0 xs0Var, Context context, zp0 zp0Var) {
        super(context, null);
        this.V = xs0Var;
        this.U = zp0Var;
    }

    @Override // org.telegram.ui.Components.mz
    public final int getColumnsCount() {
        return this.V.o1[xs0.z0(this.U.E) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.mz
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
                } else if (xs0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.mz, android.view.View
    public final void onDraw(Canvas canvas) {
        xs0 xs0Var = this.V;
        xs0Var.V0.setColor(xs0Var.s0(org.telegram.ui.ActionBar.k6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), xs0Var.V0);
        super.onDraw(canvas);
    }
}
