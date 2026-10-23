package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gt0 extends FragmentContextView {
    public final /* synthetic */ uv0 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, uv0 uv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, uv0Var2, false, d6Var);
        this.R0 = uv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        uv0 uv0Var = this.R0;
        uv0Var.P0.i(uv0Var.Q0, i10 == 0, true);
    }
}
