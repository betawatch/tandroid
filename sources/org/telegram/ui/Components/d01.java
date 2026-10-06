package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class d01 {
    public static final d01 e = new d01(false, new a01(TLObject.FLAG_31, -2147483647), g01.R, 0.0f);
    public final boolean a;
    public final a01 b;
    public final sz0 c;
    public final float d;

    public d01(boolean z10, a01 a01Var, sz0 sz0Var, float f7) {
        this.a = z10;
        this.b = a01Var;
        this.c = sz0Var;
        this.d = f7;
    }

    public static sz0 a(d01 d01Var, boolean z10) {
        sz0 sz0Var = d01Var.c;
        return sz0Var != g01.R ? sz0Var : d01Var.d == 0.0f ? z10 ? g01.S : g01.T : g01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d01.class != obj.getClass()) {
            return false;
        }
        d01 d01Var = (d01) obj;
        return this.c.equals(d01Var.c) && this.b.equals(d01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
