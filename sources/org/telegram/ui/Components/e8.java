package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
