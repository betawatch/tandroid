package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class du extends qu {
    public final /* synthetic */ qu Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(qu quVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(f2Var, context, h6Var, arrayList);
        this.Q1 = quVar;
    }

    @Override // org.telegram.ui.Components.qu
    public final void L0() {
        this.Q1.dismiss();
    }
}
