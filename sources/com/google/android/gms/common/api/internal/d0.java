package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class d0 extends o8.c {
    public final WeakReference b;

    public d0(f0 f0Var) {
        this.b = new WeakReference(f0Var);
    }

    @Override // o8.d
    public final void B(o8.h hVar) {
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
