package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        ji.j jVar = new ji.j(this);
        jVar.E(this.a, "key");
        jVar.E(this.b, "feature");
        return jVar.toString();
    }
}
