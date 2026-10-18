package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
