package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a0 extends r8.c {
    public final WeakReference b;

    public a0(c0 c0Var) {
        this.b = new WeakReference(c0Var);
    }

    @Override // r8.d
    public final void W0(r8.h hVar) {
        c0 c0Var = (c0) this.b.get();
        if (c0Var == null) {
            return;
        }
        y yVar = new y(this, c0Var, c0Var, hVar);
        e0 e0Var = c0Var.a.e;
        e0Var.sendMessage(e0Var.obtainMessage(1, yVar));
    }
}
