package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
