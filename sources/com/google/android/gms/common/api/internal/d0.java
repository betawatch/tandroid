package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
