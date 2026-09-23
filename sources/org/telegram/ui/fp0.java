package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fp0 extends org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ op0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(op0 op0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.Y2 = op0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.ml0
    public final Integer W0(int i10) {
        op0 op0Var = this.Y2;
        if ((i10 < op0Var.b0 || i10 >= op0Var.c0) && (i10 < op0Var.d0 || i10 >= op0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        op0 op0Var = this.Y2;
        if (!op0Var.G || op0Var.E == null || op0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(op0Var.E.getLeft() + op0Var.F.getLeft(), op0Var.F.getTop());
        op0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        op0 op0Var = this.Y2;
        up0 up0Var = op0Var.p0;
        op0Var.h();
        if (op0Var.K != null) {
            if (op0Var.J == null || !op0Var.c()) {
                return;
            }
            op0Var.J.g(false);
            return;
        }
        yh.l5 l5Var = this.X2 == 1 ? up0Var.c : up0Var.b;
        if (l5Var == null || !op0Var.c()) {
            return;
        }
        l5Var.a();
    }
}
