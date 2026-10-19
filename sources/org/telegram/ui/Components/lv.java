package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lv extends aw {
    public final /* synthetic */ aw W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(aw awVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, context, d6Var, arrayList);
        this.W = awVar;
    }

    @Override // org.telegram.ui.Components.aw
    public final void Z() {
        this.W.dismiss();
    }
}
