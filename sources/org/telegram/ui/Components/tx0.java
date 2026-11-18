package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class tx0 {
    public static final tx0 e = new tx0(false, new qx0(TLObject.FLAG_31, -2147483647), wx0.T, 0.0f);
    public final boolean a;
    public final qx0 b;
    public final ix0 c;
    public final float d;

    public tx0(boolean z10, qx0 qx0Var, ix0 ix0Var, float f10) {
        this.a = z10;
        this.b = qx0Var;
        this.c = ix0Var;
        this.d = f10;
    }

    public static ix0 a(tx0 tx0Var, boolean z10) {
        ix0 ix0Var = tx0Var.c;
        return ix0Var != wx0.T ? ix0Var : tx0Var.d == 0.0f ? z10 ? wx0.U : wx0.V : wx0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        return this.c.equals(tx0Var.c) && this.b.equals(tx0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
