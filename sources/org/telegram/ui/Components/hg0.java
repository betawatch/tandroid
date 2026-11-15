package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hg0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ kg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg0(kg0 kg0Var, Activity activity) {
        super(activity);
        this.b = kg0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        kg0 kg0Var = this.b;
        ib0 ib0Var = kg0Var.I;
        ib0 ib0Var2 = kg0Var.H;
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        ib0Var2.setItemCount(i11);
        ib0Var.setItemCount(i11);
        ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.a = false;
        int size = View.MeasureSpec.getSize(i7);
        kg0Var.O = size;
        if (size != 0) {
            kg0Var.c(false);
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
