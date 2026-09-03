package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g60 extends rl0 {
    public int U2;
    public final /* synthetic */ t60 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(t60 t60Var, Context context) {
        super(context, null);
        this.V2 = t60Var;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        t60 t60Var = this.V2;
        g60 g60Var = t60Var.S;
        if (this.U2 != View.MeasureSpec.getSize(i11)) {
            this.U2 = View.MeasureSpec.getSize(i11);
            t60Var.X = true;
            g60Var.setPadding(0, 0, 0, 0);
            t60Var.X = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.U2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.U2 - measuredHeight;
            }
            t60Var.X = true;
            g60Var.setPadding(0, i13, 0, 0);
            t60Var.X = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.X) {
            return;
        }
        super.requestLayout();
    }
}
