package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.j5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
