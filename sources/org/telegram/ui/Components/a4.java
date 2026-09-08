package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ vc0 b;
    public final /* synthetic */ vc0 c;
    public final /* synthetic */ vc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3) {
        super(context);
        this.b = vc0Var;
        this.c = vc0Var2;
        this.d = vc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        vc0 vc0Var = this.b;
        vc0Var.setItemCount(i12);
        vc0 vc0Var2 = this.c;
        vc0Var2.setItemCount(i12);
        vc0 vc0Var3 = this.d;
        vc0Var3.setItemCount(i12);
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
