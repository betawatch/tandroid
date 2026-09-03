package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p81 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new p81());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        ((q81) view).set(h51Var.z);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        return h51Var.z == h51Var2.z;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q81(context, g6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }
}
