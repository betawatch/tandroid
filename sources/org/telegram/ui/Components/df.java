package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class df implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ fv0 a;
    public final /* synthetic */ uo0 b;

    public df(fv0 fv0Var, uo0 uo0Var) {
        this.a = fv0Var;
        this.b = uo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        fv0 fv0Var = this.a;
        fv0Var.post(new org.telegram.ui.ActionBar.p(this, fv0Var, this.b, 8));
    }
}
