package com.google.android.gms.common.api.internal;

import a8.ba;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h0 extends ba {
    public final WeakReference a;

    public h0(i0 i0Var) {
        this.a = new WeakReference(i0Var);
    }

    @Override // a8.ba
    public final void a() {
        i0 i0Var = (i0) this.a.get();
        if (i0Var == null) {
            return;
        }
        i0.g(i0Var);
    }
}
