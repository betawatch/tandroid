package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ wp0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.Y2 = wp0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.wl0
    public final Integer X0(int i10) {
        wp0 wp0Var = this.Y2;
        if ((i10 < wp0Var.b0 || i10 >= wp0Var.c0) && (i10 < wp0Var.d0 || i10 >= wp0Var.e0)) {
            return super.X0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wp0 wp0Var = this.Y2;
        if (!wp0Var.G || wp0Var.E == null || wp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(wp0Var.E.getLeft() + wp0Var.F.getLeft(), wp0Var.F.getTop());
        wp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        wp0 wp0Var = this.Y2;
        cq0 cq0Var = wp0Var.p0;
        wp0Var.h();
        if (wp0Var.K != null) {
            if (wp0Var.J == null || !wp0Var.c()) {
                return;
            }
            wp0Var.J.g(false);
            return;
        }
        yh.l5 l5Var = this.X2 == 1 ? cq0Var.c : cq0Var.b;
        if (l5Var == null || !wp0Var.c()) {
            return;
        }
        l5Var.a();
    }
}
