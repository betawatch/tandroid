package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i01 {
    public static final i01 e = new i01(false, new f01(TLObject.FLAG_31, -2147483647), l01.R, 0.0f);
    public final boolean a;
    public final f01 b;
    public final xz0 c;
    public final float d;

    public i01(boolean z10, f01 f01Var, xz0 xz0Var, float f7) {
        this.a = z10;
        this.b = f01Var;
        this.c = xz0Var;
        this.d = f7;
    }

    public static xz0 a(i01 i01Var, boolean z10) {
        xz0 xz0Var = i01Var.c;
        return xz0Var != l01.R ? xz0Var : i01Var.d == 0.0f ? z10 ? l01.S : l01.T : l01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i01.class != obj.getClass()) {
            return false;
        }
        i01 i01Var = (i01) obj;
        return this.c.equals(i01Var.c) && this.b.equals(i01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
