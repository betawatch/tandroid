package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mx0 {
    public static final mx0 e = new mx0(false, new jx0(TLObject.FLAG_31, -2147483647), px0.T, 0.0f);
    public final boolean a;
    public final jx0 b;
    public final bx0 c;
    public final float d;

    public mx0(boolean z10, jx0 jx0Var, bx0 bx0Var, float f10) {
        this.a = z10;
        this.b = jx0Var;
        this.c = bx0Var;
        this.d = f10;
    }

    public static bx0 a(mx0 mx0Var, boolean z10) {
        bx0 bx0Var = mx0Var.c;
        return bx0Var != px0.T ? bx0Var : mx0Var.d == 0.0f ? z10 ? px0.U : px0.V : px0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx0.class != obj.getClass()) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        return this.c.equals(mx0Var.c) && this.b.equals(mx0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
