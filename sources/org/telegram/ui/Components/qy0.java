package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qy0 {
    public static final qy0 e = new qy0(false, new ny0(TLObject.FLAG_31, -2147483647), ty0.N, 0.0f);
    public final boolean a;
    public final ny0 b;
    public final fy0 c;
    public final float d;

    public qy0(boolean z10, ny0 ny0Var, fy0 fy0Var, float f10) {
        this.a = z10;
        this.b = ny0Var;
        this.c = fy0Var;
        this.d = f10;
    }

    public static fy0 a(qy0 qy0Var, boolean z10) {
        fy0 fy0Var = qy0Var.c;
        return fy0Var != ty0.N ? fy0Var : qy0Var.d == 0.0f ? z10 ? ty0.O : ty0.P : ty0.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy0.class != obj.getClass()) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        return this.c.equals(qy0Var.c) && this.b.equals(qy0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
