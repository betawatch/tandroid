package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e0 extends o8.c {
    public final WeakReference b;

    public e0(g0 g0Var) {
        this.b = new WeakReference(g0Var);
    }

    @Override // o8.d
    public final void B(o8.h hVar) {
        g0 g0Var = (g0) this.b.get();
        if (g0Var == null) {
            return;
        }
        m0 m0Var = g0Var.a;
        c0 c0Var = new c0(g0Var, g0Var, hVar);
        h0 h0Var = m0Var.e;
        h0Var.sendMessage(h0Var.obtainMessage(1, c0Var));
    }
}
