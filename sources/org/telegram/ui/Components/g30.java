package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g30 extends FrameLayout {
    public final /* synthetic */ l30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(l30 l30Var, Context context) {
        super(context);
        this.a = l30Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        l30.m(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        l30 l30Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l30Var.c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        int y3 = org.telegram.messenger.wl.y(200.0f, View.MeasureSpec.getSize(i10), 2);
        l30Var.b.setPadding(y3, 0, y3, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(l30Var.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), 0);
    }
}
