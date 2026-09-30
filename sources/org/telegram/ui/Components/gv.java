package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class gv extends vv {
    public final /* synthetic */ vv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(vv vvVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, context, d6Var, arrayList);
        this.W = vvVar;
    }

    @Override // org.telegram.ui.Components.vv
    public final void Y() {
        this.W.dismiss();
    }
}
