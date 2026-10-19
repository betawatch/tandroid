package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import v7.i5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class h0 extends i5 {
    public final WeakReference a;

    public h0(i0 i0Var) {
        this.a = new WeakReference(i0Var);
    }

    @Override // v7.i5
    public final void a() {
        i0 i0Var = (i0) this.a.get();
        if (i0Var == null) {
            return;
        }
        i0.h(i0Var);
    }
}
