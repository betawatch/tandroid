package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qr0 extends FragmentContextView {
    public final /* synthetic */ eu0 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, eu0 eu0Var2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, o2Var, eu0Var2, false, b6Var);
        this.J0 = eu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i9) {
        eu0 eu0Var = this.J0;
        eu0Var.L0.i(eu0Var.M0, i9 == 0, true);
    }
}
