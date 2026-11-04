package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ws0 a;

    public vq0(ws0 ws0Var) {
        this.a = ws0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ws0 ws0Var = this.a;
        if (ws0Var.q0 == null) {
            return;
        }
        ws0Var.q0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - ws0Var.q0.getRight());
    }
}
