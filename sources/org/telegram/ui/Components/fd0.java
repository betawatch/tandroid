package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fd0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ld0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(ld0 ld0Var, Activity activity) {
        super(activity, null);
        this.G1 = ld0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
