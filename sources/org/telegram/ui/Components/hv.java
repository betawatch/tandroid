package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hv extends wv {
    public final /* synthetic */ wv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(wv wvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, context, d6Var, arrayList);
        this.W = wvVar;
    }

    @Override // org.telegram.ui.Components.wv
    public final void X() {
        this.W.dismiss();
    }
}
