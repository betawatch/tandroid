package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qi extends FragmentContextView {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ vi Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(vi viVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout2) {
        super(context, e2Var, frameLayout, false, e6Var);
        this.Z0 = viVar;
        this.Y0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        this.Z0.y.i(this.Y0, i7 == 0, true);
    }
}
