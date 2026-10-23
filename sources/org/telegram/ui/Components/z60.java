package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class z60 extends mm0 {
    public int Y2;
    public final /* synthetic */ m70 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(m70 m70Var, Context context) {
        super(context, null);
        this.Z2 = m70Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        m70 m70Var = this.Z2;
        z60 z60Var = m70Var.V;
        if (this.Y2 != View.MeasureSpec.getSize(i11)) {
            this.Y2 = View.MeasureSpec.getSize(i11);
            m70Var.a0 = true;
            z60Var.setPadding(0, 0, 0, 0);
            m70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.Y2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.Y2 - measuredHeight;
            }
            m70Var.a0 = true;
            z60Var.setPadding(0, i13, 0, 0);
            m70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Z2.a0) {
            return;
        }
        super.requestLayout();
    }
}
