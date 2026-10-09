package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g70 extends qm0 {
    public int V2;
    public final /* synthetic */ t70 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(t70 t70Var, Context context) {
        super(context, null);
        this.W2 = t70Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        t70 t70Var = this.W2;
        g70 g70Var = t70Var.V;
        if (this.V2 != View.MeasureSpec.getSize(i11)) {
            this.V2 = View.MeasureSpec.getSize(i11);
            t70Var.a0 = true;
            g70Var.setPadding(0, 0, 0, 0);
            t70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.V2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.V2 - measuredHeight;
            }
            t70Var.a0 = true;
            g70Var.setPadding(0, i13, 0, 0);
            t70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W2.a0) {
            return;
        }
        super.requestLayout();
    }
}
