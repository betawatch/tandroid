package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mp0 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ vp0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(vp0 vp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.Y2 = vp0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final Integer V0(int i10) {
        vp0 vp0Var = this.Y2;
        if ((i10 < vp0Var.b0 || i10 >= vp0Var.c0) && (i10 < vp0Var.d0 || i10 >= vp0Var.e0)) {
            return super.V0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vp0 vp0Var = this.Y2;
        if (!vp0Var.G || vp0Var.E == null || vp0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(vp0Var.E.getLeft() + vp0Var.F.getLeft(), vp0Var.F.getTop());
        vp0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        vp0 vp0Var = this.Y2;
        bq0 bq0Var = vp0Var.p0;
        vp0Var.h();
        if (vp0Var.K != null) {
            if (vp0Var.J == null || !vp0Var.c()) {
                return;
            }
            vp0Var.J.g(false);
            return;
        }
        zh.j5 j5Var = this.X2 == 1 ? bq0Var.c : bq0Var.b;
        if (j5Var == null || !vp0Var.c()) {
            return;
        }
        j5Var.a();
    }
}
