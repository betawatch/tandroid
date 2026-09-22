package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ up0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.Y2 = up0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final Integer W0(int i10) {
        up0 up0Var = this.Y2;
        if ((i10 < up0Var.b0 || i10 >= up0Var.c0) && (i10 < up0Var.d0 || i10 >= up0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        up0 up0Var = this.Y2;
        if (!up0Var.G || up0Var.E == null || up0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(up0Var.E.getLeft() + up0Var.F.getLeft(), up0Var.F.getTop());
        up0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        up0 up0Var = this.Y2;
        aq0 aq0Var = up0Var.p0;
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J == null || !up0Var.c()) {
                return;
            }
            up0Var.J.g(false);
            return;
        }
        yh.m5 m5Var = this.X2 == 1 ? aq0Var.c : aq0Var.b;
        if (m5Var == null || !up0Var.c()) {
            return;
        }
        m5Var.a();
    }
}
