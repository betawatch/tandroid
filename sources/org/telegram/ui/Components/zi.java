package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zi extends FragmentContextView {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ dj Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(dj djVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, FrameLayout frameLayout2) {
        super(context, g2Var, frameLayout, false, i6Var);
        this.Z0 = djVar;
        this.Y0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        this.Z0.y.j(this.Y0, i7 == 0, true);
    }
}
