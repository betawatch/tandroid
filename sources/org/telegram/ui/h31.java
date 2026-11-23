package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h31 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.m41.h(new h31());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        ((i31) view).set(n41Var.A);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.A == n41Var2.A;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new i31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
