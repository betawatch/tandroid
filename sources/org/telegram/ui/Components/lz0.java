package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lz0 {
    public static final lz0 e = new lz0(false, new iz0(TLObject.FLAG_31, -2147483647), oz0.O, 0.0f);
    public final boolean a;
    public final iz0 b;
    public final az0 c;
    public final float d;

    public lz0(boolean z4, iz0 iz0Var, az0 az0Var, float f10) {
        this.a = z4;
        this.b = iz0Var;
        this.c = az0Var;
        this.d = f10;
    }

    public static az0 a(lz0 lz0Var, boolean z4) {
        az0 az0Var = lz0Var.c;
        return az0Var != oz0.O ? az0Var : lz0Var.d == 0.0f ? z4 ? oz0.P : oz0.Q : oz0.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lz0.class != obj.getClass()) {
            return false;
        }
        lz0 lz0Var = (lz0) obj;
        return this.c.equals(lz0Var.c) && this.b.equals(lz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
