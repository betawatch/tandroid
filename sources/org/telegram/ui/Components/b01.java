package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class b01 {
    public static final b01 e = new b01(false, new yz0(TLObject.FLAG_31, -2147483647), e01.R, 0.0f);
    public final boolean a;
    public final yz0 b;
    public final qz0 c;
    public final float d;

    public b01(boolean z10, yz0 yz0Var, qz0 qz0Var, float f7) {
        this.a = z10;
        this.b = yz0Var;
        this.c = qz0Var;
        this.d = f7;
    }

    public static qz0 a(b01 b01Var, boolean z10) {
        qz0 qz0Var = b01Var.c;
        return qz0Var != e01.R ? qz0Var : b01Var.d == 0.0f ? z10 ? e01.S : e01.T : e01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b01.class != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        return this.c.equals(b01Var.c) && this.b.equals(b01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
