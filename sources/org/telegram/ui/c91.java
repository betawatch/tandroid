package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c91 extends org.telegram.ui.Components.o61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new c91());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        ((d91) view).set(p61Var.z);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(org.telegram.ui.Components.p61 p61Var, org.telegram.ui.Components.p61 p61Var2) {
        return p61Var.z == p61Var2.z;
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new d91(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(org.telegram.ui.Components.p61 p61Var, org.telegram.ui.Components.p61 p61Var2) {
        return p61Var.d == p61Var2.d;
    }
}
