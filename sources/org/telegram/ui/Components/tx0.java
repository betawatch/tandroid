package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
