package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.k41.h(new i31());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        ((j31) view).set(l41Var.A);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        return l41Var.A == l41Var2.A;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new j31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }
}
