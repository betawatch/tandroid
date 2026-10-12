package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cj extends FragmentContextView {
    public final /* synthetic */ FrameLayout R0;
    public final /* synthetic */ hj S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(hj hjVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout2) {
        super(context, m2Var, frameLayout, false, c6Var);
        this.S0 = hjVar;
        this.R0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.S0.x.i(this.R0, i10 == 0, true);
    }
}
