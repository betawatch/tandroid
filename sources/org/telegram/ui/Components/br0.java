package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class br0 extends FragmentContextView {
    public final /* synthetic */ jt0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, jt0 jt0Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, jt0Var2, false, h6Var);
        this.Y0 = jt0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        jt0 jt0Var = this.Y0;
        jt0Var.S0.j(jt0Var.T0, i7 == 0, true);
    }
}
