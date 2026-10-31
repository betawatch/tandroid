package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p50 extends tk0 {
    public int e3;
    public final /* synthetic */ c60 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(c60 c60Var, Context context) {
        super(context, null);
        this.f3 = c60Var;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        c60 c60Var = this.f3;
        p50 p50Var = c60Var.M1;
        if (this.e3 != View.MeasureSpec.getSize(i11)) {
            this.e3 = View.MeasureSpec.getSize(i11);
            c60Var.R1 = true;
            p50Var.setPadding(0, 0, 0, 0);
            c60Var.R1 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.e3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < org.telegram.messenger.i0.L(60.0f) + (i12 - measuredHeight)) {
                i13 = this.e3 - measuredHeight;
            }
            c60Var.R1 = true;
            p50Var.setPadding(0, i13, 0, 0);
            c60Var.R1 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.R1) {
            return;
        }
        super.requestLayout();
    }
}
