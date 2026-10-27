package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ep0 extends org.telegram.ui.Components.nm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ np0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(np0 np0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.g3 = np0Var;
        this.f3 = i10;
    }

    @Override // org.telegram.ui.Components.nm0
    public final Integer W0(int i10) {
        np0 np0Var = this.g3;
        if ((i10 < np0Var.b0 || i10 >= np0Var.c0) && (i10 < np0Var.d0 || i10 >= np0Var.e0)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        np0 np0Var = this.g3;
        if (!np0Var.G || np0Var.E == null || np0Var.F == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(np0Var.E.getLeft() + np0Var.F.getLeft(), np0Var.F.getTop());
        np0Var.E.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        np0 np0Var = this.g3;
        tp0 tp0Var = np0Var.p0;
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J == null || !np0Var.c()) {
                return;
            }
            np0Var.J.g(false);
            return;
        }
        bi.t9 t9Var = this.f3 == 1 ? tp0Var.c : tp0Var.b;
        if (t9Var == null || !np0Var.c()) {
            return;
        }
        t9Var.b();
    }
}
