package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e0 extends c8.c {
    public final WeakReference b;

    public e0(g0 g0Var) {
        this.b = new WeakReference(g0Var);
    }

    @Override // c8.d
    public final void h(c8.h hVar) {
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
