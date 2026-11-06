package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ix0 {
    public static final ix0 e = new ix0(false, new fx0(TLObject.FLAG_31, -2147483647), lx0.R, 0.0f);
    public final boolean a;
    public final fx0 b;
    public final xw0 c;
    public final float d;

    public ix0(boolean z9, fx0 fx0Var, xw0 xw0Var, float f10) {
        this.a = z9;
        this.b = fx0Var;
        this.c = xw0Var;
        this.d = f10;
    }

    public static xw0 a(ix0 ix0Var, boolean z9) {
        xw0 xw0Var = ix0Var.c;
        return xw0Var != lx0.R ? xw0Var : ix0Var.d == 0.0f ? z9 ? lx0.S : lx0.T : lx0.U;
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
