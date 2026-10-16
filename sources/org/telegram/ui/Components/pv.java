package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pv extends ew {
    public final /* synthetic */ ew W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(ew ewVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(m2Var, context, c6Var, arrayList);
        this.W = ewVar;
    }

    @Override // org.telegram.ui.Components.ew
    public final void Z() {
        this.W.dismiss();
    }
}
