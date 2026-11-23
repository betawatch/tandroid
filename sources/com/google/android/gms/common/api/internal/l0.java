package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class l0 {
    public final a a;
    public final n6.c b;

    public /* synthetic */ l0(a aVar, n6.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (q6.m.l(this.a, l0Var.a) && q6.m.l(this.b, l0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        j6.k kVar = new j6.k(this);
        kVar.S(this.a, "key");
        kVar.S(this.b, "feature");
        return kVar.toString();
    }
}
