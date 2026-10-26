package com.google.android.gms.common.api.internal;

import a8.ba;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
