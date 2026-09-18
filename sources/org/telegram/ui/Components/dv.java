package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class dv extends sv {
    public final /* synthetic */ sv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(sv svVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, context, e6Var, arrayList);
        this.W = svVar;
    }

    @Override // org.telegram.ui.Components.sv
    public final void Y() {
        this.W.dismiss();
    }
}
