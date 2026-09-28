package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class dj extends FragmentContextView {
    public final /* synthetic */ FrameLayout Q0;
    public final /* synthetic */ ij R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(ij ijVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout2) {
        super(context, m2Var, frameLayout, false, d6Var);
        this.R0 = ijVar;
        this.Q0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.R0.x.i(this.Q0, i10 == 0, true);
    }
}
