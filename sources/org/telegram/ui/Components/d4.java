package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ tb0 b;
    public final /* synthetic */ tb0 c;
    public final /* synthetic */ tb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Context context, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3) {
        super(context);
        this.b = tb0Var;
        this.c = tb0Var2;
        this.d = tb0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        tb0 tb0Var = this.b;
        tb0Var.setItemCount(i11);
        tb0 tb0Var2 = this.c;
        tb0Var2.setItemCount(i11);
        tb0 tb0Var3 = this.d;
        tb0Var3.setItemCount(i11);
        tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        tb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
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
