package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s50 extends zk0 {
    public int T2;
    public final /* synthetic */ f60 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(f60 f60Var, Context context) {
        super(context, null);
        this.U2 = f60Var;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        f60 f60Var = this.U2;
        s50 s50Var = f60Var.R;
        if (this.T2 != View.MeasureSpec.getSize(i11)) {
            this.T2 = View.MeasureSpec.getSize(i11);
            f60Var.W = true;
            s50Var.setPadding(0, 0, 0, 0);
            f60Var.W = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.T2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.T2 - measuredHeight;
            }
            f60Var.W = true;
            s50Var.setPadding(0, i13, 0, 0);
            f60Var.W = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.W) {
            return;
        }
        super.requestLayout();
    }
}
