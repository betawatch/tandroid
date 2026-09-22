package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
