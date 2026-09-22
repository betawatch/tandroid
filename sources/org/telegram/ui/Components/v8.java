package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v8 extends b9 {
    public final /* synthetic */ u8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(c9 c9Var, Activity activity, u8 u8Var) {
        super(c9Var, activity);
        this.G = u8Var;
    }

    @Override // org.telegram.ui.Components.b9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
