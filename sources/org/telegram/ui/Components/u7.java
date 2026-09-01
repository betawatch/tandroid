package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u7 extends lo0 {
    public final /* synthetic */ c8 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.i0 = c8Var;
    }

    @Override // org.telegram.ui.Components.lo0
    public final boolean d(MotionEvent motionEvent) {
        if (this.i0.E0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
