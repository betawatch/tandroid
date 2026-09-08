package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gz0 {
    public static final gz0 e = new gz0(false, new dz0(TLObject.FLAG_31, -2147483647), jz0.R, 0.0f);
    public final boolean a;
    public final dz0 b;
    public final vy0 c;
    public final float d;

    public gz0(boolean z10, dz0 dz0Var, vy0 vy0Var, float f7) {
        this.a = z10;
        this.b = dz0Var;
        this.c = vy0Var;
        this.d = f7;
    }

    public static vy0 a(gz0 gz0Var, boolean z10) {
        vy0 vy0Var = gz0Var.c;
        return vy0Var != jz0.R ? vy0Var : gz0Var.d == 0.0f ? z10 ? jz0.S : jz0.T : jz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gz0.class != obj.getClass()) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        return this.c.equals(gz0Var.c) && this.b.equals(gz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
