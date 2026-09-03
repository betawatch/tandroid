package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h60 extends sl0 {
    public int U2;
    public final /* synthetic */ u60 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(u60 u60Var, Context context) {
        super(context, null);
        this.V2 = u60Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        u60 u60Var = this.V2;
        h60 h60Var = u60Var.S;
        if (this.U2 != View.MeasureSpec.getSize(i11)) {
            this.U2 = View.MeasureSpec.getSize(i11);
            u60Var.X = true;
            h60Var.setPadding(0, 0, 0, 0);
            u60Var.X = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.U2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.U2 - measuredHeight;
            }
            u60Var.X = true;
            h60Var.setPadding(0, i13, 0, 0);
            u60Var.X = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.X) {
            return;
        }
        super.requestLayout();
    }
}
