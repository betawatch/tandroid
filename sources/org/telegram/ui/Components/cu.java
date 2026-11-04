package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cu extends pu {
    public final /* synthetic */ pu O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(pu puVar, org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(d2Var, context, e6Var, arrayList);
        this.O1 = puVar;
    }

    @Override // org.telegram.ui.Components.pu
    public final void L0() {
        this.O1.dismiss();
    }
}
