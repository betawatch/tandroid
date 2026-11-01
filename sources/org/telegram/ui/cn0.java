package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cn0 extends org.telegram.ui.Components.uk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ ln0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(ln0 ln0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f3 = ln0Var;
        this.e3 = i10;
    }

    @Override // org.telegram.ui.Components.uk0
    public final Integer V0(int i10) {
        ln0 ln0Var = this.f3;
        if ((i10 < ln0Var.b0 || i10 >= ln0Var.c0) && (i10 < ln0Var.d0 || i10 >= ln0Var.e0)) {
            return super.V0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ln0 ln0Var = this.f3;
        if (!ln0Var.G || ln0Var.E == null || ln0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(ln0Var.E.getLeft() + ln0Var.F.getLeft(), ln0Var.F.getTop());
        ln0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ln0 ln0Var = this.f3;
        rn0 rn0Var = ln0Var.p0;
        ln0Var.h();
        if (ln0Var.K != null) {
            if (ln0Var.J == null || !ln0Var.c()) {
                return;
            }
            ln0Var.J.g(false);
            return;
        }
        rh.v5 v5Var = this.e3 == 1 ? rn0Var.c : rn0Var.b;
        if (v5Var == null || !ln0Var.c()) {
            return;
        }
        v5Var.b();
    }
}
