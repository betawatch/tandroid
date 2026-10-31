package org.telegram.ui;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p30 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ac0 b;
    public final /* synthetic */ l30 c;
    public final /* synthetic */ m30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(LaunchActivity launchActivity, org.telegram.ui.Components.ac0 ac0Var, l30 l30Var, m30 m30Var) {
        super(launchActivity);
        this.b = ac0Var;
        this.c = l30Var;
        this.d = m30Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.ac0 ac0Var = this.b;
        ac0Var.setItemCount(5);
        l30 l30Var = this.c;
        l30Var.setItemCount(5);
        m30 m30Var = this.d;
        m30Var.setItemCount(5);
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        l30Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        m30Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        this.a = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
