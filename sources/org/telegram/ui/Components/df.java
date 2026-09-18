package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class df implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ gv0 a;
    public final /* synthetic */ vo0 b;

    public df(gv0 gv0Var, vo0 vo0Var) {
        this.a = gv0Var;
        this.b = vo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        gv0 gv0Var = this.a;
        gv0Var.post(new org.telegram.ui.ActionBar.q(this, gv0Var, this.b, 8));
    }
}
