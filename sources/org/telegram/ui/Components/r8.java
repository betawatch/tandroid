package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
