package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ cb0 b;
    public final /* synthetic */ cb0 c;
    public final /* synthetic */ cb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(Context context, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3) {
        super(context);
        this.b = cb0Var;
        this.c = cb0Var2;
        this.d = cb0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        cb0 cb0Var = this.b;
        cb0Var.setItemCount(i11);
        cb0 cb0Var2 = this.c;
        cb0Var2.setItemCount(i11);
        cb0 cb0Var3 = this.d;
        cb0Var3.setItemCount(i11);
        cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        cb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        cb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
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
