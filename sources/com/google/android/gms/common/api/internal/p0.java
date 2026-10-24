package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class p0 {
    public final b a;
    public final k6.c b;

    public /* synthetic */ p0(b bVar, k6.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p0)) {
            p0 p0Var = (p0) obj;
            if (n6.l.l(this.a, p0Var.a) && n6.l.l(this.b, p0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        mi.q qVar = new mi.q(this);
        qVar.z(this.a, "key");
        qVar.z(this.b, "feature");
        return qVar.toString();
    }
}
