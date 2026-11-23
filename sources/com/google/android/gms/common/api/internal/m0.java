package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class m0 {
    public final a a;
    public final n6.c b;

    public /* synthetic */ m0(a aVar, n6.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (q6.m.l(this.a, m0Var.a) && q6.m.l(this.b, m0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ji.l lVar = new ji.l(this);
        lVar.E(this.a, "key");
        lVar.E(this.b, "feature");
        return lVar.toString();
    }
}
