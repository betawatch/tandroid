package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ev extends tv {
    public final /* synthetic */ tv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(tv tvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, context, f6Var, arrayList);
        this.W = tvVar;
    }

    @Override // org.telegram.ui.Components.tv
    public final void Y() {
        this.W.dismiss();
    }
}
