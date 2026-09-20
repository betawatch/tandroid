package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c91 extends org.telegram.ui.Components.v51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new c91());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        ((d91) view).set(w51Var.z);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean contentsEquals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        return w51Var.z == w51Var2.z;
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new d91(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean equals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        return w51Var.d == w51Var2.d;
    }
}
