package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.g5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i0 extends g5 {
    public final WeakReference a;

    public i0(j0 j0Var) {
        this.a = new WeakReference(j0Var);
    }

    @Override // v7.g5
    public final void a() {
        j0 j0Var = (j0) this.a.get();
        if (j0Var == null) {
            return;
        }
        j0.g(j0Var);
    }
}
