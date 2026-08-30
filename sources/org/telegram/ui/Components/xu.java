package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xu extends mv {
    public final /* synthetic */ mv T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(mv mvVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, context, f6Var, arrayList);
        this.T = mvVar;
    }

    @Override // org.telegram.ui.Components.mv
    public final void Y() {
        this.T.dismiss();
    }
}
