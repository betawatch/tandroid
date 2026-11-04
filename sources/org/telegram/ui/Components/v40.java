package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v40 extends tj0 {
    public int f3;
    public final /* synthetic */ i50 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v40(i50 i50Var, Context context) {
        super(context, null);
        this.g3 = i50Var;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        i50 i50Var = this.g3;
        v40 v40Var = i50Var.N1;
        if (this.f3 != View.MeasureSpec.getSize(i10)) {
            this.f3 = View.MeasureSpec.getSize(i10);
            i50Var.S1 = true;
            v40Var.setPadding(0, 0, 0, 0);
            i50Var.S1 = false;
            measure(i3, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f3;
            int i12 = (int) ((i11 / 5.0f) * 2.0f);
            if (i12 < org.telegram.messenger.g0.L(60.0f) + (i11 - measuredHeight)) {
                i12 = this.f3 - measuredHeight;
            }
            i50Var.S1 = true;
            v40Var.setPadding(0, i12, 0, 0);
            i50Var.S1 = false;
            measure(i3, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
        }
        super.onMeasure(i3, i10);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.S1) {
            return;
        }
        super.requestLayout();
    }
}
