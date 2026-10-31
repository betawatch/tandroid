package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ac0 b;
    public final /* synthetic */ ac0 c;
    public final /* synthetic */ ac0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(Context context, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3) {
        super(context);
        this.b = ac0Var;
        this.c = ac0Var2;
        this.d = ac0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = org.telegram.messenger.i0.q;
        int i12 = point.x > point.y ? 3 : 5;
        ac0 ac0Var = this.b;
        ac0Var.setItemCount(i12);
        ac0 ac0Var2 = this.c;
        ac0Var2.setItemCount(i12);
        ac0 ac0Var3 = this.d;
        ac0Var3.setItemCount(i12);
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
        ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
        ac0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
        this.a = false;
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
