package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class aj extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ fj Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(fj fjVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout2) {
        super(context, o2Var, frameLayout, false, g6Var);
        this.Y0 = fjVar;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.Y0.x.i(this.X0, i10 == 0, true);
    }
}
