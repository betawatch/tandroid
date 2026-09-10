package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lp0 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ up0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.Y2 = up0Var;
        this.X2 = i10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final Integer V0(int i10) {
        up0 up0Var = this.Y2;
        if ((i10 < up0Var.b0 || i10 >= up0Var.c0) && (i10 < up0Var.d0 || i10 >= up0Var.e0)) {
            return super.V0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        up0 up0Var = this.Y2;
        bq0 bq0Var = up0Var.p0;
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J == null || !up0Var.c()) {
                return;
            }
            up0Var.J.g(false);
            return;
        }
        xh.n5 n5Var = this.X2 == 1 ? bq0Var.c : bq0Var.b;
        if (n5Var == null || !up0Var.c()) {
            return;
        }
        n5Var.a();
    }
}
