package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ wp0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.Y2 = wp0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.ml0
    public final Integer X0(int i10) {
        wp0 wp0Var = this.Y2;
        if ((i10 < wp0Var.b0 || i10 >= wp0Var.c0) && (i10 < wp0Var.d0 || i10 >= wp0Var.e0)) {
            return super.X0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        yh.n5 n5Var = this.X2 == 1 ? cq0Var.c : cq0Var.b;
        if (n5Var == null || !wp0Var.c()) {
            return;
        }
        n5Var.a();
    }
}
