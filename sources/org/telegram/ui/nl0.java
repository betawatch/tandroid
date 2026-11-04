package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nl0 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ wl0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl0(wl0 wl0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.g3 = wl0Var;
        this.f3 = i3;
    }

    @Override // org.telegram.ui.Components.tj0
    public final Integer V0(int i3) {
        wl0 wl0Var = this.g3;
        if ((i3 < wl0Var.c0 || i3 >= wl0Var.d0) && (i3 < wl0Var.e0 || i3 >= wl0Var.f0)) {
            return super.V0(i3);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wl0 wl0Var = this.g3;
        if (!wl0Var.H || wl0Var.F == null || wl0Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(wl0Var.F.getLeft() + wl0Var.G.getLeft(), wl0Var.G.getTop());
        wl0Var.F.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        wl0 wl0Var = this.g3;
        cm0 cm0Var = wl0Var.q0;
        wl0Var.h();
        if (wl0Var.L != null) {
            if (wl0Var.K == null || !wl0Var.c()) {
                return;
            }
            wl0Var.K.g(false);
            return;
        }
        ci.v8 v8Var = this.f3 == 1 ? cm0Var.c : cm0Var.b;
        if (v8Var == null || !wl0Var.c()) {
            return;
        }
        v8Var.a();
    }
}
