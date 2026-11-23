package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        d0 d0Var = c0Var.a.e;
        d0Var.sendMessage(d0Var.obtainMessage(1, yVar));
    }
}
