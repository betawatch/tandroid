package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d0 extends p8.c {
    public final WeakReference b;

    public d0(f0 f0Var) {
        this.b = new WeakReference(f0Var);
    }

    @Override // p8.d
    public final void m(p8.h hVar) {
        f0 f0Var = (f0) this.b.get();
        if (f0Var == null) {
            return;
        }
        l0 l0Var = f0Var.a;
        b0 b0Var = new b0(f0Var, f0Var, hVar);
        g0 g0Var = l0Var.e;
        g0Var.sendMessage(g0Var.obtainMessage(1, b0Var));
    }
}
