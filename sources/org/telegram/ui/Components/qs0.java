package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qs0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ zu0 a;

    public qs0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        zu0 zu0Var = this.a;
        if (zu0Var.n0 == null) {
            return;
        }
        zu0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - zu0Var.n0.getRight());
    }
}
