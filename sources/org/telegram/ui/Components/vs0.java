package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vs0 extends FragmentContextView {
    public final /* synthetic */ jv0 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, jv0 jv0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, jv0Var2, false, f6Var);
        this.P0 = jv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        jv0 jv0Var = this.P0;
        jv0Var.P0.i(jv0Var.Q0, i10 == 0, true);
    }
}
