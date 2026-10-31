package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class en0 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ nn0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(nn0 nn0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f3 = nn0Var;
        this.e3 = i10;
    }

    @Override // org.telegram.ui.Components.tk0
    public final Integer V0(int i10) {
        nn0 nn0Var = this.f3;
        if ((i10 < nn0Var.b0 || i10 >= nn0Var.c0) && (i10 < nn0Var.d0 || i10 >= nn0Var.e0)) {
            return super.V0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        nn0 nn0Var = this.f3;
        if (!nn0Var.G || nn0Var.E == null || nn0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(nn0Var.E.getLeft() + nn0Var.F.getLeft(), nn0Var.F.getTop());
        nn0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        nn0 nn0Var = this.f3;
        tn0 tn0Var = nn0Var.p0;
        nn0Var.h();
        if (nn0Var.K != null) {
            if (nn0Var.J == null || !nn0Var.c()) {
                return;
            }
            nn0Var.J.g(false);
            return;
        }
        rh.v5 v5Var = this.e3 == 1 ? tn0Var.c : tn0Var.b;
        if (v5Var == null || !nn0Var.c()) {
            return;
        }
        v5Var.b();
    }
}
