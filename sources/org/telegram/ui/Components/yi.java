package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yi extends FragmentContextView {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ cj Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(cj cjVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, FrameLayout frameLayout2) {
        super(context, h2Var, frameLayout, false, i6Var);
        this.Z0 = cjVar;
        this.Y0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        this.Z0.y.j(this.Y0, i7 == 0, true);
    }
}
