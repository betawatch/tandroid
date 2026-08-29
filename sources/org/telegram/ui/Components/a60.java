package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a60 extends jl0 {
    public int T2;
    public final /* synthetic */ n60 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(n60 n60Var, Context context) {
        super(context, null);
        this.U2 = n60Var;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        n60 n60Var = this.U2;
        a60 a60Var = n60Var.R;
        if (this.T2 != View.MeasureSpec.getSize(i11)) {
            this.T2 = View.MeasureSpec.getSize(i11);
            n60Var.W = true;
            a60Var.setPadding(0, 0, 0, 0);
            n60Var.W = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.T2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.T2 - measuredHeight;
            }
            n60Var.W = true;
            a60Var.setPadding(0, i13, 0, 0);
            n60Var.W = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.W) {
            return;
        }
        super.requestLayout();
    }
}
