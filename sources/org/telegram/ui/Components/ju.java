package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ju extends wu {
    public final /* synthetic */ wu R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(wu wuVar, org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(e2Var, context, e6Var, arrayList);
        this.R1 = wuVar;
    }

    @Override // org.telegram.ui.Components.wu
    public final void L0() {
        this.R1.dismiss();
    }
}
