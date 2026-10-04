package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class c01 {
    public static final c01 e = new c01(false, new zz0(TLObject.FLAG_31, -2147483647), f01.R, 0.0f);
    public final boolean a;
    public final zz0 b;
    public final rz0 c;
    public final float d;

    public c01(boolean z10, zz0 zz0Var, rz0 rz0Var, float f7) {
        this.a = z10;
        this.b = zz0Var;
        this.c = rz0Var;
        this.d = f7;
    }

    public static rz0 a(c01 c01Var, boolean z10) {
        rz0 rz0Var = c01Var.c;
        return rz0Var != f01.R ? rz0Var : c01Var.d == 0.0f ? z10 ? f01.S : f01.T : f01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        return this.c.equals(c01Var.c) && this.b.equals(c01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
