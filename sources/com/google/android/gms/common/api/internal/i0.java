package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.h5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class i0 extends h5 {
    public final WeakReference a;

    public i0(j0 j0Var) {
        this.a = new WeakReference(j0Var);
    }

    @Override // v7.h5
    public final void a() {
        j0 j0Var = (j0) this.a.get();
        if (j0Var == null) {
            return;
        }
        j0.g(j0Var);
    }
}
