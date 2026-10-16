package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e8 extends gp0 {
    public final /* synthetic */ m8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(m8 m8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.l0 = m8Var;
    }

    @Override // org.telegram.ui.Components.gp0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
