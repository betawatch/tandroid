package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ze implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ xu0 a;
    public final /* synthetic */ oo0 b;

    public ze(xu0 xu0Var, oo0 oo0Var) {
        this.a = xu0Var;
        this.b = oo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        xu0 xu0Var = this.a;
        xu0Var.post(new g(this, xu0Var, this.b, 2));
    }
}
