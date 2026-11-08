package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ji extends FragmentContextView {
    public final /* synthetic */ FrameLayout X0;
    public final /* synthetic */ ni Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(ni niVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout2) {
        super(context, f2Var, frameLayout, false, f6Var);
        this.Y0 = niVar;
        this.X0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        this.Y0.y.i(this.X0, i7 == 0, true);
    }
}
