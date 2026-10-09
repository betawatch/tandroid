package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        n4.x xVar = new n4.x(this);
        xVar.o(this.a, "key");
        xVar.o(this.b, "feature");
        return xVar.toString();
    }
}
