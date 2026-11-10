package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class z extends r8.c {
    public final WeakReference b;

    public z(b0 b0Var) {
        this.b = new WeakReference(b0Var);
    }

    @Override // r8.d
    public final void V0(r8.h hVar) {
        b0 b0Var = (b0) this.b.get();
        if (b0Var == null) {
            return;
        }
        x xVar = new x(this, b0Var, b0Var, hVar);
        c0 c0Var = b0Var.a.e;
        c0Var.sendMessage(c0Var.obtainMessage(1, xVar));
    }
}
