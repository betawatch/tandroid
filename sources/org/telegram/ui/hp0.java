package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.zl0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ qp0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(qp0 qp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f3 = qp0Var;
        this.e3 = i10;
    }

    @Override // org.telegram.ui.Components.zl0
    public final Integer W0(int i10) {
        qp0 qp0Var = this.f3;
        if ((i10 < qp0Var.b0 || i10 >= qp0Var.c0) && (i10 < qp0Var.d0 || i10 >= qp0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qp0 qp0Var = this.f3;
        if (!qp0Var.G || qp0Var.E == null || qp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(qp0Var.E.getLeft() + qp0Var.F.getLeft(), qp0Var.F.getTop());
        qp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qp0 qp0Var = this.f3;
        wp0 wp0Var = qp0Var.p0;
        qp0Var.h();
        if (qp0Var.K != null) {
            if (qp0Var.J == null || !qp0Var.c()) {
                return;
            }
            qp0Var.J.g(false);
            return;
        }
        yh.l5 l5Var = this.e3 == 1 ? wp0Var.c : wp0Var.b;
        if (l5Var == null || !qp0Var.c()) {
            return;
        }
        l5Var.a();
    }
}
