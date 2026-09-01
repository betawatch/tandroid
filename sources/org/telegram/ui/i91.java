package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i91 extends org.telegram.ui.Components.tl0 {
    public int U2;
    public final /* synthetic */ ha1 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(ha1 ha1Var, Context context) {
        super(context, null);
        this.V2 = ha1Var;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        m91 m91Var;
        super.onMeasure(i10, i11);
        if (this.U2 != getMeasuredHeight() && (m91Var = this.V2.U) != null) {
            m91Var.l();
        }
        this.U2 = getMeasuredHeight();
    }
}
