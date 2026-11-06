package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class oe implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ it0 a;
    public final /* synthetic */ an0 b;

    public oe(it0 it0Var, an0 an0Var) {
        this.a = it0Var;
        this.b = an0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        it0 it0Var = this.a;
        it0Var.post(new l2.z0(this, it0Var, this.b, 27));
    }
}
