package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class me implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ht0 a;
    public final /* synthetic */ dn0 b;

    public me(ht0 ht0Var, dn0 dn0Var) {
        this.a = ht0Var;
        this.b = dn0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ht0 ht0Var = this.a;
        ht0Var.post(new e7(this, ht0Var, this.b, 1));
    }
}
