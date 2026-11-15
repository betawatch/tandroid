package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ib0 b;
    public final /* synthetic */ ib0 c;
    public final /* synthetic */ ib0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(Context context, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3) {
        super(context);
        this.b = ib0Var;
        this.c = ib0Var2;
        this.d = ib0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        ib0 ib0Var = this.b;
        ib0Var.setItemCount(i11);
        ib0 ib0Var2 = this.c;
        ib0Var2.setItemCount(i11);
        ib0 ib0Var3 = this.d;
        ib0Var3.setItemCount(i11);
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        ib0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
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
