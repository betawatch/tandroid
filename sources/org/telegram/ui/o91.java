package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o91 extends org.telegram.ui.Components.sl0 {
    public int U2;
    public final /* synthetic */ na1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o91(na1 na1Var, Context context) {
        super(context, null);
        this.V2 = na1Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        s91 s91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (s91Var = this.V2.U) != null) {
            s91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
