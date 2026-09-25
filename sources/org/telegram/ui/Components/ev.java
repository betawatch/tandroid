package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ev extends tv {
    public final /* synthetic */ tv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(tv tvVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, context, d6Var, arrayList);
        this.W = tvVar;
    }

    @Override // org.telegram.ui.Components.tv
    public final void Y() {
        this.W.dismiss();
    }
}
