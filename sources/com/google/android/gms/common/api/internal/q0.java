package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final u5.c b;

    public /* synthetic */ q0(b bVar, u5.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q0)) {
            q0 q0Var = (q0) obj;
            if (x5.l.l(this.a, q0Var.a) && x5.l.l(this.b, q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        w4.e eVar = new w4.e(this);
        eVar.c(this.a, "key");
        eVar.c(this.b, "feature");
        return eVar.toString();
    }
}
