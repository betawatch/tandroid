package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.Components.n41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.n41.h(new i31());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        ((j31) view).set(o41Var.A);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(org.telegram.ui.Components.o41 o41Var, org.telegram.ui.Components.o41 o41Var2) {
        return o41Var.A == o41Var2.A;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new j31(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(org.telegram.ui.Components.o41 o41Var, org.telegram.ui.Components.o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }
}
