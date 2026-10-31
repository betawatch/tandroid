package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class je implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ lu0 a;
    public final /* synthetic */ bo0 b;

    public je(lu0 lu0Var, bo0 bo0Var) {
        this.a = lu0Var;
        this.b = bo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        lu0 lu0Var = this.a;
        lu0Var.post(new li.s(this, lu0Var, this.b, 27));
    }
}
