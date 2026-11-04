package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ii extends FragmentContextView {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ ni Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(ni niVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout2) {
        super(context, d2Var, frameLayout, false, e6Var);
        this.Z0 = niVar;
        this.Y0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i3) {
        this.Z0.y.i(this.Y0, i3 == 0, true);
    }
}
