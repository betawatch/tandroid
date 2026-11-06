package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class du extends qu {
    public final /* synthetic */ qu N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(qu quVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(f2Var, context, f6Var, arrayList);
        this.N1 = quVar;
    }

    @Override // org.telegram.ui.Components.qu
    public final void L0() {
        this.N1.dismiss();
    }
}
