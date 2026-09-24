package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.i5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
