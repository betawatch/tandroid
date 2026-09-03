package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
