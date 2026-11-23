package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
