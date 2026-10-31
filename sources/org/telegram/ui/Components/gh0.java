package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gh0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ jh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(jh0 jh0Var, Activity activity) {
        super(activity);
        this.b = jh0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jh0 jh0Var = this.b;
        ac0 ac0Var = jh0Var.H;
        ac0 ac0Var2 = jh0Var.G;
        this.a = true;
        Point point = org.telegram.messenger.i0.q;
        int i12 = point.x > point.y ? 3 : 5;
        ac0Var2.setItemCount(i12);
        ac0Var.setItemCount(i12);
        ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * i12;
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        jh0Var.N = size;
        if (size != 0) {
            jh0Var.c(false);
        }
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
