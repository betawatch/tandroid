package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ye implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ut0 a;
    public final /* synthetic */ pn0 b;

    public ye(ut0 ut0Var, pn0 pn0Var) {
        this.a = ut0Var;
        this.b = pn0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ut0 ut0Var = this.a;
        ut0Var.post(new g(this, ut0Var, this.b, 3));
    }
}
