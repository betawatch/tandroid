package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final k6.c b;

    public /* synthetic */ q0(b bVar, k6.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q0)) {
            q0 q0Var = (q0) obj;
            if (n6.l.l(this.a, q0Var.a) && n6.l.l(this.b, q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        m4.c cVar = new m4.c(this);
        cVar.u(this.a, "key");
        cVar.u(this.b, "feature");
        return cVar.toString();
    }
}
