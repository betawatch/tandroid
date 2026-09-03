package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fs0 extends u00 {
    public final /* synthetic */ tr0 R;
    public final /* synthetic */ yu0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(yu0 yu0Var, Context context, tr0 tr0Var) {
        super(context, null);
        this.S = yu0Var;
        this.R = tr0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        return this.S.j1[yu0.p0(this.R.C) ? 1 : 0];
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
                } else if (yu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.u00, android.view.View
    public final void onDraw(Canvas canvas) {
        yu0 yu0Var = this.S;
        yu0Var.Q0.setColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yu0Var.Q0);
        super.onDraw(canvas);
    }
}
