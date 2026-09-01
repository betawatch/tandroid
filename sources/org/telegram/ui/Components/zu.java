package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zu extends ov {
    public final /* synthetic */ ov T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(ov ovVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(p2Var, context, g6Var, arrayList);
        this.T = ovVar;
    }

    @Override // org.telegram.ui.Components.ov
    public final void Y() {
        this.T.dismiss();
    }
}
