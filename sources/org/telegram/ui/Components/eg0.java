package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class eg0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ hg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(hg0 hg0Var, Activity activity) {
        super(activity);
        this.b = hg0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        hg0 hg0Var = this.b;
        hb0 hb0Var = hg0Var.H;
        hb0 hb0Var2 = hg0Var.G;
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        hb0Var2.setItemCount(i11);
        hb0Var.setItemCount(i11);
        hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * i11;
        this.a = false;
        int size = View.MeasureSpec.getSize(i7);
        hg0Var.N = size;
        if (size != 0) {
            hg0Var.c(false);
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
