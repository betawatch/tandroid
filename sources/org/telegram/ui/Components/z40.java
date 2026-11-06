package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z40 extends pj0 {
    public int e3;
    public final /* synthetic */ m50 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(m50 m50Var, Context context) {
        super(context, null);
        this.f3 = m50Var;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        m50 m50Var = this.f3;
        z40 z40Var = m50Var.M1;
        if (this.e3 != View.MeasureSpec.getSize(i10)) {
            this.e3 = View.MeasureSpec.getSize(i10);
            m50Var.R1 = true;
            z40Var.setPadding(0, 0, 0, 0);
            m50Var.R1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.e3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.e3 - measuredHeight;
            }
            m50Var.R1 = true;
            z40Var.setPadding(0, i12, 0, 0);
            m50Var.R1 = false;
            measure(i7, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.R1) {
            return;
        }
        super.requestLayout();
    }
}
