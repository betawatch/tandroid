package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tv extends iw {
    public final /* synthetic */ iw W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(iw iwVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, context, e6Var, arrayList);
        this.W = iwVar;
    }

    @Override // org.telegram.ui.Components.iw
    public final void Z() {
        this.W.dismiss();
    }
}
