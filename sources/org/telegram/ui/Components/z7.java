package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z7 extends go0 {
    public final /* synthetic */ h8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(h8 h8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.l0 = h8Var;
    }

    @Override // org.telegram.ui.Components.go0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
