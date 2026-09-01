package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final y5.c b;

    public /* synthetic */ q0(b bVar, y5.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q0)) {
            q0 q0Var = (q0) obj;
            if (b6.m.l(this.a, q0Var.a) && b6.m.l(this.b, q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(this.a, "key");
        bVar.r(this.b, "feature");
        return bVar.toString();
    }
}
