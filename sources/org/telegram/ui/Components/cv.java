package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
