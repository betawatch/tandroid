package org.telegram.ui;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l20 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.cb0 b;
    public final /* synthetic */ h20 c;
    public final /* synthetic */ i20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(LaunchActivity launchActivity, org.telegram.ui.Components.cb0 cb0Var, h20 h20Var, i20 i20Var) {
        super(launchActivity);
        this.b = cb0Var;
        this.c = h20Var;
        this.d = i20Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.a = true;
        org.telegram.ui.Components.cb0 cb0Var = this.b;
        cb0Var.setItemCount(5);
        h20 h20Var = this.c;
        h20Var.setItemCount(5);
        i20 i20Var = this.d;
        i20Var.setItemCount(5);
        cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        h20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        i20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.a = false;
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
