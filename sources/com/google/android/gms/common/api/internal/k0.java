package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k0 {
    public final a a;
    public final n6.c b;

    public /* synthetic */ k0(a aVar, n6.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (q6.m.k(this.a, k0Var.a) && q6.m.k(this.b, k0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        j2.n nVar = new j2.n(this);
        nVar.X(this.a, "key");
        nVar.X(this.b, "feature");
        return nVar.toString();
    }
}
