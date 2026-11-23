package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class gd0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ md0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(md0 md0Var, Activity activity) {
        super(activity, null);
        this.G1 = md0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
