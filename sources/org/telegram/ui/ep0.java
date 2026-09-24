package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ep0 extends org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ np0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(np0 np0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.Y2 = np0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.wl0
    public final Integer W0(int i10) {
        np0 np0Var = this.Y2;
        if ((i10 < np0Var.b0 || i10 >= np0Var.c0) && (i10 < np0Var.d0 || i10 >= np0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        np0 np0Var = this.Y2;
        if (!np0Var.G || np0Var.E == null || np0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(np0Var.E.getLeft() + np0Var.F.getLeft(), np0Var.F.getTop());
        np0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        np0 np0Var = this.Y2;
        tp0 tp0Var = np0Var.p0;
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J == null || !np0Var.c()) {
                return;
            }
            np0Var.J.g(false);
            return;
        }
        yh.k5 k5Var = this.X2 == 1 ? tp0Var.c : tp0Var.b;
        if (k5Var == null || !np0Var.c()) {
            return;
        }
        k5Var.a();
    }
}
