package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ix0 {
    public static final ix0 e = new ix0(false, new fx0(TLObject.FLAG_31, -2147483647), lx0.S, 0.0f);
    public final boolean a;
    public final fx0 b;
    public final xw0 c;
    public final float d;

    public ix0(boolean z10, fx0 fx0Var, xw0 xw0Var, float f10) {
        this.a = z10;
        this.b = fx0Var;
        this.c = xw0Var;
        this.d = f10;
    }

    public static xw0 a(ix0 ix0Var, boolean z10) {
        xw0 xw0Var = ix0Var.c;
        return xw0Var != lx0.S ? xw0Var : ix0Var.d == 0.0f ? z10 ? lx0.T : lx0.U : lx0.V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix0.class != obj.getClass()) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        return this.c.equals(ix0Var.c) && this.b.equals(ix0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
