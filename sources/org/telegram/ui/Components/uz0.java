package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class uz0 {
    public static final uz0 e = new uz0(false, new rz0(TLObject.FLAG_31, -2147483647), xz0.R, 0.0f);
    public final boolean a;
    public final rz0 b;
    public final jz0 c;
    public final float d;

    public uz0(boolean z10, rz0 rz0Var, jz0 jz0Var, float f7) {
        this.a = z10;
        this.b = rz0Var;
        this.c = jz0Var;
        this.d = f7;
    }

    public static jz0 a(uz0 uz0Var, boolean z10) {
        jz0 jz0Var = uz0Var.c;
        return jz0Var != xz0.R ? jz0Var : uz0Var.d == 0.0f ? z10 ? xz0.S : xz0.T : xz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uz0.class != obj.getClass()) {
            return false;
        }
        uz0 uz0Var = (uz0) obj;
        return this.c.equals(uz0Var.c) && this.b.equals(uz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
