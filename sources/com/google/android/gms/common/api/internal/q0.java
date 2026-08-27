package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final v5.c b;

    public /* synthetic */ q0(b bVar, v5.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q0)) {
            q0 q0Var = (q0) obj;
            if (y5.l.l(this.a, q0Var.a) && y5.l.l(this.b, q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        w3.b0 b0Var = new w3.b0(this);
        b0Var.e(this.a, "key");
        b0Var.e(this.b, "feature");
        return b0Var.toString();
    }
}
