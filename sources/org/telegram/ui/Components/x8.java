package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
