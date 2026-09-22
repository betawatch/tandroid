package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z7 extends fo0 {
    public final /* synthetic */ h8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(h8 h8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.l0 = h8Var;
    }

    @Override // org.telegram.ui.Components.fo0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
