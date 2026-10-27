package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class aj extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ fj Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(fj fjVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, FrameLayout frameLayout2) {
        super(context, r2Var, frameLayout, false, u6Var);
        this.Y0 = fjVar;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.Y0.x.i(this.X0, i10 == 0, true);
    }
}
