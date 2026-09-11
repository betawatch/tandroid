package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
