package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final w5.c b;

    public /* synthetic */ q0(b bVar, w5.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q0)) {
            q0 q0Var = (q0) obj;
            if (z5.l.l(this.a, q0Var.a) && z5.l.l(this.b, q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        v5.n nVar = new v5.n(this);
        nVar.g(this.a, "key");
        nVar.g(this.b, "feature");
        return nVar.toString();
    }
}
