package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class z extends r8.c {
    public final WeakReference b;

    public z(b0 b0Var) {
        this.b = new WeakReference(b0Var);
    }

    @Override // r8.d
    public final void A0(r8.h hVar) {
        b0 b0Var = (b0) this.b.get();
        if (b0Var == null) {
            return;
        }
        x xVar = new x(this, b0Var, b0Var, hVar);
        c0 c0Var = b0Var.a.e;
        c0Var.sendMessage(c0Var.obtainMessage(1, xVar));
    }
}
