package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c8 extends hp0 {
    public final /* synthetic */ k8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(k8 k8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.m0 = k8Var;
    }

    @Override // org.telegram.ui.Components.hp0
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.G0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
