package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c70 extends mm0 {
    public int V2;
    public final /* synthetic */ p70 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(p70 p70Var, Context context) {
        super(context, null);
        this.W2 = p70Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        p70 p70Var = this.W2;
        c70 c70Var = p70Var.V;
        if (this.V2 != View.MeasureSpec.getSize(i11)) {
            this.V2 = View.MeasureSpec.getSize(i11);
            p70Var.a0 = true;
            c70Var.setPadding(0, 0, 0, 0);
            p70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.V2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.V2 - measuredHeight;
            }
            p70Var.a0 = true;
            c70Var.setPadding(0, i13, 0, 0);
            p70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W2.a0) {
            return;
        }
        super.requestLayout();
    }
}
