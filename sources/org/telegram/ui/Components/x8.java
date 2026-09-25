package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class x8 extends d9 {
    public final /* synthetic */ w8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(e9 e9Var, Activity activity, w8 w8Var) {
        super(e9Var, activity);
        this.G = w8Var;
    }

    @Override // org.telegram.ui.Components.d9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
