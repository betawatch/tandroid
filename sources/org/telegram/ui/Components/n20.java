package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n20 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.b40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(org.telegram.ui.b40 b40Var, Context context) {
        super(context);
        this.a = b40Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r20.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        org.telegram.ui.b40 b40Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b40Var.j1.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.i0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y3 = org.telegram.messenger.z20.y(200.0f, View.MeasureSpec.getSize(i10), 2);
        b40Var.i1.setPadding(y3, 0, y3, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(b40Var.k1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), TLObject.FLAG_30), 0);
    }
}
