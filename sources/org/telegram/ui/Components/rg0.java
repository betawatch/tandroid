package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rg0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ug0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(ug0 ug0Var, Activity activity) {
        super(activity);
        this.b = ug0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ug0 ug0Var = this.b;
        sb0 sb0Var = ug0Var.I;
        sb0 sb0Var2 = ug0Var.H;
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        sb0Var2.setItemCount(i11);
        sb0Var.setItemCount(i11);
        sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.a = false;
        int size = View.MeasureSpec.getSize(i7);
        ug0Var.O = size;
        if (size != 0) {
            ug0Var.c(false);
        }
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
