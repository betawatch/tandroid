package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p91 extends org.telegram.ui.Components.rl0 {
    public int U2;
    public final /* synthetic */ oa1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(oa1 oa1Var, Context context) {
        super(context, null);
        this.V2 = oa1Var;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        t91 t91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (t91Var = this.V2.U) != null) {
            t91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
