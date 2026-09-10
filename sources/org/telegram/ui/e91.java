package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e91 extends org.telegram.ui.Components.u51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new e91());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        ((f91) view).set(v51Var.z);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.v51 v51Var2) {
        return v51Var.z == v51Var2.z;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f91(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }
}
