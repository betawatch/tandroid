package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
