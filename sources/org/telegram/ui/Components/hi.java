package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hi extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ mi Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(mi miVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, FrameLayout frameLayout2) {
        super(context, k2Var, frameLayout, false, p6Var);
        this.Y0 = miVar;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.Y0.y.i(this.X0, i10 == 0, true);
    }
}
