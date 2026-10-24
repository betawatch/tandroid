package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ot0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xv0 a;

    public ot0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        xv0 xv0Var = this.a;
        if (xv0Var.n0 == null) {
            return;
        }
        xv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - xv0Var.n0.getRight());
    }
}
