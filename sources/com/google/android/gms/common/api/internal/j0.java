package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.j5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j0 extends j5 {
    public final WeakReference a;

    public j0(k0 k0Var) {
        this.a = new WeakReference(k0Var);
    }

    @Override // v7.j5
    public final void a() {
        k0 k0Var = (k0) this.a.get();
        if (k0Var == null) {
            return;
        }
        k0.g(k0Var);
    }
}
