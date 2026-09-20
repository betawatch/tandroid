package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class rs0 extends t00 {
    public final /* synthetic */ fs0 U;
    public final /* synthetic */ jv0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(jv0 jv0Var, Context context, fs0 fs0Var) {
        super(context, null);
        this.V = jv0Var;
        this.U = fs0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getColumnsCount() {
        return this.V.m1[jv0.p0(this.U.F) ? 1 : 0];
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
                } else if (jv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override // org.telegram.ui.Components.t00, android.view.View
    public final void onDraw(Canvas canvas) {
        jv0 jv0Var = this.V;
        jv0Var.T0.setColor(jv0Var.h0(org.telegram.ui.ActionBar.j6.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jv0Var.T0);
        super.onDraw(canvas);
    }
}
