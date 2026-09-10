package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hv extends wv {
    public final /* synthetic */ wv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(wv wvVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, context, f6Var, arrayList);
        this.W = wvVar;
    }

    @Override // org.telegram.ui.Components.wv
    public final void Y() {
        this.W.dismiss();
    }
}
