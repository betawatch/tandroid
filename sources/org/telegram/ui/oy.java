package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oy extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.z41.h(new oy());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        py pyVar = (py) view;
        pyVar.n = (org.telegram.messenger.q20) a51Var.G;
        pyVar.r = a51Var;
        pyVar.b(a51Var.z, false);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new py(context, p6Var);
    }
}
