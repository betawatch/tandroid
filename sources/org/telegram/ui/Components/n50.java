package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class n50 extends ek0 {
    public int f3;
    public final /* synthetic */ a60 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(a60 a60Var, Context context) {
        super(context, null);
        this.g3 = a60Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        a60 a60Var = this.g3;
        n50 n50Var = a60Var.Q1;
        if (this.f3 != View.MeasureSpec.getSize(i10)) {
            this.f3 = View.MeasureSpec.getSize(i10);
            a60Var.V1 = true;
            n50Var.setPadding(0, 0, 0, 0);
            a60Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f3 - measuredHeight;
            }
            a60Var.V1 = true;
            n50Var.setPadding(0, i12, 0, 0);
            a60Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.V1) {
            return;
        }
        super.requestLayout();
    }
}
