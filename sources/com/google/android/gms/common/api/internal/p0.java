package com.google.android.gms.common.api.internal;

import java.util.Arrays;
import m4.w1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
