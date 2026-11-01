package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class r0 {
    public final b a;
    public final k6.c b;

    public /* synthetic */ r0(b bVar, k6.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof r0)) {
            r0 r0Var = (r0) obj;
            if (n6.l.k(this.a, r0Var.a) && n6.l.k(this.b, r0Var.b)) {
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
