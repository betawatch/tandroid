package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cp0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ lp0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(lp0 lp0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.g3 = lp0Var;
        this.f3 = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        lp0 lp0Var = this.g3;
        if ((i10 < lp0Var.b0 || i10 >= lp0Var.c0) && (i10 < lp0Var.d0 || i10 >= lp0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lp0 lp0Var = this.g3;
        if (!lp0Var.G || lp0Var.E == null || lp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(lp0Var.E.getLeft() + lp0Var.F.getLeft(), lp0Var.F.getTop());
        lp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lp0 lp0Var = this.g3;
        rp0 rp0Var = lp0Var.p0;
        lp0Var.h();
        if (lp0Var.K != null) {
            if (lp0Var.J == null || !lp0Var.c()) {
                return;
            }
            lp0Var.J.g(false);
            return;
        }
        bi.t9 t9Var = this.f3 == 1 ? rp0Var.c : rp0Var.b;
        if (t9Var == null || !lp0Var.c()) {
            return;
        }
        t9Var.b();
    }
}
