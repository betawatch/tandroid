package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
