package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class tg0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ wg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(wg0 wg0Var, Activity activity) {
        super(activity);
        this.b = wg0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        wg0 wg0Var = this.b;
        tb0 tb0Var = wg0Var.I;
        tb0 tb0Var2 = wg0Var.H;
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        tb0Var2.setItemCount(i11);
        tb0Var.setItemCount(i11);
        tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.a = false;
        int size = View.MeasureSpec.getSize(i7);
        wg0Var.O = size;
        if (size != 0) {
            wg0Var.c(false);
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
