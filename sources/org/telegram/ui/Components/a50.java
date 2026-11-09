package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a50 extends qj0 {
    public int e3;
    public final /* synthetic */ n50 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a50(n50 n50Var, Context context) {
        super(context, null);
        this.f3 = n50Var;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        n50 n50Var = this.f3;
        a50 a50Var = n50Var.M1;
        if (this.e3 != View.MeasureSpec.getSize(i10)) {
            this.e3 = View.MeasureSpec.getSize(i10);
            n50Var.R1 = true;
            a50Var.setPadding(0, 0, 0, 0);
            n50Var.R1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.e3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.e3 - measuredHeight;
            }
            n50Var.R1 = true;
            a50Var.setPadding(0, i12, 0, 0);
            n50Var.R1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.R1) {
            return;
        }
        super.requestLayout();
    }
}
