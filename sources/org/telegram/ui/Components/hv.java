package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
