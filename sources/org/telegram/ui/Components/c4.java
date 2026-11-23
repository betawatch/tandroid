package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ qb0 b;
    public final /* synthetic */ qb0 c;
    public final /* synthetic */ qb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3) {
        super(context);
        this.b = qb0Var;
        this.c = qb0Var2;
        this.d = qb0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        qb0 qb0Var = this.b;
        qb0Var.setItemCount(i11);
        qb0 qb0Var2 = this.c;
        qb0Var2.setItemCount(i11);
        qb0 qb0Var3 = this.d;
        qb0Var3.setItemCount(i11);
        qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        qb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
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
