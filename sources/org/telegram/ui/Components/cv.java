package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cv extends rv {
    public final /* synthetic */ rv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(rv rvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, context, f6Var, arrayList);
        this.W = rvVar;
    }

    @Override // org.telegram.ui.Components.rv
    public final void Y() {
        this.W.dismiss();
    }
}
