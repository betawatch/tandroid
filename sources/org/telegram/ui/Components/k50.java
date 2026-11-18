package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k50 extends ck0 {
    public int f3;
    public final /* synthetic */ x50 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(x50 x50Var, Context context) {
        super(context, null);
        this.g3 = x50Var;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        x50 x50Var = this.g3;
        k50 k50Var = x50Var.Q1;
        if (this.f3 != View.MeasureSpec.getSize(i10)) {
            this.f3 = View.MeasureSpec.getSize(i10);
            x50Var.V1 = true;
            k50Var.setPadding(0, 0, 0, 0);
            x50Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f3 - measuredHeight;
            }
            x50Var.V1 = true;
            k50Var.setPadding(0, i12, 0, 0);
            x50Var.V1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.V1) {
            return;
        }
        super.requestLayout();
    }
}
