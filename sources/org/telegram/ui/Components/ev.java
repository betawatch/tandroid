package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
