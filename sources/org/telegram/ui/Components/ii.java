package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ii extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ mi Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(mi miVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, FrameLayout frameLayout2) {
        super(context, f2Var, frameLayout, false, h6Var);
        this.Y0 = miVar;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        this.Y0.y.i(this.X0, i7 == 0, true);
    }
}
