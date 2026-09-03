package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        af.c cVar = new af.c(this);
        cVar.s(this.a, "key");
        cVar.s(this.b, "feature");
        return cVar.toString();
    }
}
