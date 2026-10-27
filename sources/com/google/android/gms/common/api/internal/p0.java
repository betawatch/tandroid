package com.google.android.gms.common.api.internal;

import java.util.Arrays;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p0 {
    public final b a;
    public final l6.c b;

    public /* synthetic */ p0(b bVar, l6.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p0)) {
            p0 p0Var = (p0) obj;
            if (o6.l.l(this.a, p0Var.a) && o6.l.l(this.b, p0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        w1Var.x(this.a, "key");
        w1Var.x(this.b, "feature");
        return w1Var.toString();
    }
}
