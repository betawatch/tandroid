package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
