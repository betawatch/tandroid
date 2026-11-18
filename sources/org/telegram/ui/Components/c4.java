package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ sb0 b;
    public final /* synthetic */ sb0 c;
    public final /* synthetic */ sb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        super(context);
        this.b = sb0Var;
        this.c = sb0Var2;
        this.d = sb0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        sb0 sb0Var = this.b;
        sb0Var.setItemCount(i11);
        sb0 sb0Var2 = this.c;
        sb0Var2.setItemCount(i11);
        sb0 sb0Var3 = this.d;
        sb0Var3.setItemCount(i11);
        sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        sb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
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
