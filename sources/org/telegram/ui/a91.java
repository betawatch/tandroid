package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a91 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new a91());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        ((b91) view).set(j51Var.z);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        return j51Var.z == j51Var2.z;
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new b91(context, f6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        return j51Var.d == j51Var2.d;
    }
}
