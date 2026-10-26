package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a70 extends mm0 {
    public int f3;
    public final /* synthetic */ n70 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(n70 n70Var, Context context) {
        super(context, null);
        this.g3 = n70Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        n70 n70Var = this.g3;
        a70 a70Var = n70Var.V;
        if (this.f3 != View.MeasureSpec.getSize(i11)) {
            this.f3 = View.MeasureSpec.getSize(i11);
            n70Var.a0 = true;
            a70Var.setPadding(0, 0, 0, 0);
            n70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.f3 - measuredHeight;
            }
            n70Var.a0 = true;
            a70Var.setPadding(0, i13, 0, 0);
            n70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.a0) {
            return;
        }
        super.requestLayout();
    }
}
