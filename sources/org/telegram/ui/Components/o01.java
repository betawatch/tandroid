package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o01 {
    public static final o01 e = new o01(false, new l01(TLObject.FLAG_31, -2147483647), r01.R, 0.0f);
    public final boolean a;
    public final l01 b;
    public final kb1 c;
    public final float d;

    public o01(boolean z10, l01 l01Var, kb1 kb1Var, float f7) {
        this.a = z10;
        this.b = l01Var;
        this.c = kb1Var;
        this.d = f7;
    }

    public static kb1 a(o01 o01Var, boolean z10) {
        kb1 kb1Var = o01Var.c;
        return kb1Var != r01.R ? kb1Var : o01Var.d == 0.0f ? z10 ? r01.S : r01.T : r01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o01.class != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return this.c.equals(o01Var.c) && this.b.equals(o01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
