package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 {
    public final a a;
    public final m6.c b;

    public /* synthetic */ k0(a aVar, m6.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (p6.m.k(this.a, k0Var.a) && p6.m.k(this.b, k0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        m2.t tVar = new m2.t(this);
        tVar.A(this.a, "key");
        tVar.A(this.b, "feature");
        return tVar.toString();
    }
}
