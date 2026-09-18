package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
