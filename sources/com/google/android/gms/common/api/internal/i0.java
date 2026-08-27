package com.google.android.gms.common.api.internal;

import g7.h5;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 extends h5 {
    public final WeakReference a;

    public i0(j0 j0Var) {
        this.a = new WeakReference(j0Var);
    }

    @Override // g7.h5
    public final void a() {
        j0 j0Var = (j0) this.a.get();
        if (j0Var == null) {
            return;
        }
        j0.g(j0Var);
    }
}
