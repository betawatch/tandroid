package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        qVar.H(this.a, "key");
        qVar.H(this.b, "feature");
        return qVar.toString();
    }
}
