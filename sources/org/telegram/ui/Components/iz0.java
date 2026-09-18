package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class iz0 {
    public static final iz0 e = new iz0(false, new fz0(TLObject.FLAG_31, -2147483647), lz0.R, 0.0f);
    public final boolean a;
    public final fz0 b;
    public final xy0 c;
    public final float d;

    public iz0(boolean z10, fz0 fz0Var, xy0 xy0Var, float f7) {
        this.a = z10;
        this.b = fz0Var;
        this.c = xy0Var;
        this.d = f7;
    }

    public static xy0 a(iz0 iz0Var, boolean z10) {
        xy0 xy0Var = iz0Var.c;
        return xy0Var != lz0.R ? xy0Var : iz0Var.d == 0.0f ? z10 ? lz0.S : lz0.T : lz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        return this.c.equals(iz0Var.c) && this.b.equals(iz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
