package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        of.b bVar = new of.b(this);
        bVar.E(this.a, "key");
        bVar.E(this.b, "feature");
        return bVar.toString();
    }
}
