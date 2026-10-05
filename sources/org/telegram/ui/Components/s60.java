package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class s60 extends zl0 {
    public int e3;
    public final /* synthetic */ f70 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(f70 f70Var, Context context) {
        super(context, null);
        this.f3 = f70Var;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        f70 f70Var = this.f3;
        s60 s60Var = f70Var.V;
        if (this.e3 != View.MeasureSpec.getSize(i11)) {
            this.e3 = View.MeasureSpec.getSize(i11);
            f70Var.a0 = true;
            s60Var.setPadding(0, 0, 0, 0);
            f70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.e3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.e3 - measuredHeight;
            }
            f70Var.a0 = true;
            s60Var.setPadding(0, i13, 0, 0);
            f70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.a0) {
            return;
        }
        super.requestLayout();
    }
}
