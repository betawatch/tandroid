package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e0 extends o8.c {
    public final WeakReference b;

    public e0(g0 g0Var) {
        this.b = new WeakReference(g0Var);
    }

    @Override // o8.d
    public final void C(o8.h hVar) {
        g0 g0Var = (g0) this.b.get();
        if (g0Var == null) {
            return;
        }
        n0 n0Var = g0Var.a;
        c0 c0Var = new c0(g0Var, g0Var, hVar);
        i0 i0Var = n0Var.e;
        i0Var.sendMessage(i0Var.obtainMessage(1, c0Var));
    }
}
