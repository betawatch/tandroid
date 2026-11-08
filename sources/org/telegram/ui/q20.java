package org.telegram.ui;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q20 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.hb0 b;
    public final /* synthetic */ m20 c;
    public final /* synthetic */ n20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(LaunchActivity launchActivity, org.telegram.ui.Components.hb0 hb0Var, m20 m20Var, n20 n20Var) {
        super(launchActivity);
        this.b = hb0Var;
        this.c = m20Var;
        this.d = n20Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        org.telegram.ui.Components.hb0 hb0Var = this.b;
        hb0Var.setItemCount(5);
        m20 m20Var = this.c;
        m20Var.setItemCount(5);
        n20 n20Var = this.d;
        n20Var.setItemCount(5);
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        m20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        n20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.a = false;
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
