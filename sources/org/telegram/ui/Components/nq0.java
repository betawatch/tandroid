package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nq0 extends pz {
    public final /* synthetic */ aq0 V;
    public final /* synthetic */ ys0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(ys0 ys0Var, Context context, aq0 aq0Var) {
        super(context, null);
        this.W = ys0Var;
        this.V = aq0Var;
    }

    @Override // org.telegram.ui.Components.pz
    public final int getColumnsCount() {
        return this.W.p1[ys0.z0(this.V.F) ? 1 : 0];
    }

    @Override // org.telegram.ui.Components.pz
    public final int getViewType() {
        setIsSingleCell(false);
        int i7 = this.V.F;
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
                    if (this.W.L0.getTabsCount() == 1) {
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

    @Override // org.telegram.ui.Components.pz, android.view.View
    public final void onDraw(Canvas canvas) {
        ys0 ys0Var = this.W;
        ys0Var.W0.setColor(ys0Var.s0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ys0Var.W0);
        super.onDraw(canvas);
    }
}
