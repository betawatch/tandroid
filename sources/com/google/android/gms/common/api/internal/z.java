package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z extends q8.c {
    public final WeakReference b;

    public z(b0 b0Var) {
        this.b = new WeakReference(b0Var);
    }

    @Override // q8.d
    public final void Y(q8.h hVar) {
        b0 b0Var = (b0) this.b.get();
        if (b0Var == null) {
            return;
        }
        x xVar = new x(this, b0Var, b0Var, hVar);
        c0 c0Var = b0Var.a.e;
        c0Var.sendMessage(c0Var.obtainMessage(1, xVar));
    }
}
