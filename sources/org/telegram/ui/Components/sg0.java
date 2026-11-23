package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sg0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ vg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0(vg0 vg0Var, Activity activity) {
        super(activity);
        this.b = vg0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        vg0 vg0Var = this.b;
        qb0 qb0Var = vg0Var.I;
        qb0 qb0Var2 = vg0Var.H;
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        qb0Var2.setItemCount(i11);
        qb0Var.setItemCount(i11);
        qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.a = false;
        int size = View.MeasureSpec.getSize(i7);
        vg0Var.O = size;
        if (size != 0) {
            vg0Var.c(false);
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
