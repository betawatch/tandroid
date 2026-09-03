package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j30 extends FrameLayout {
    public final /* synthetic */ o30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(o30 o30Var, Context context) {
        super(context);
        this.a = o30Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        o30.m(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        o30 o30Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o30Var.c.getLayoutParams();
        if (z4) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        int x10 = org.telegram.ui.b.x(200.0f, View.MeasureSpec.getSize(i10), 2);
        o30Var.b.setPadding(x10, 0, x10, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(o30Var.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), 0);
    }
}
