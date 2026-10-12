package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.i5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i0 extends i5 {
    public final WeakReference a;

    public i0(j0 j0Var) {
        this.a = new WeakReference(j0Var);
    }

    @Override // v7.i5
    public final void a() {
        j0 j0Var = (j0) this.a.get();
        if (j0Var == null) {
            return;
        }
        j0.g(j0Var);
    }
}
