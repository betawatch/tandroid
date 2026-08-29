package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y7 extends ao0 {
    public final /* synthetic */ g8 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(g8 g8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.h0 = g8Var;
    }

    @Override // org.telegram.ui.Components.ao0
    public final boolean d(MotionEvent motionEvent) {
        if (this.h0.D0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
