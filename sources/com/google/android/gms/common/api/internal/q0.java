package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        n4.y yVar = new n4.y(this);
        yVar.y(this.a, "key");
        yVar.y(this.b, "feature");
        return yVar.toString();
    }
}
