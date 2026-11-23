package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r8 extends x8 {
    public final /* synthetic */ q8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(y8 y8Var, Activity activity, q8 q8Var) {
        super(y8Var, activity);
        this.H = q8Var;
    }

    @Override // org.telegram.ui.Components.x8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
