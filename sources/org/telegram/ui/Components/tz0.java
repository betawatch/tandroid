package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tz0 {
    public static final tz0 e = new tz0(false, new qz0(TLObject.FLAG_31, -2147483647), wz0.R, 0.0f);
    public final boolean a;
    public final qz0 b;
    public final iz0 c;
    public final float d;

    public tz0(boolean z10, qz0 qz0Var, iz0 iz0Var, float f7) {
        this.a = z10;
        this.b = qz0Var;
        this.c = iz0Var;
        this.d = f7;
    }

    public static iz0 a(tz0 tz0Var, boolean z10) {
        iz0 iz0Var = tz0Var.c;
        return iz0Var != wz0.R ? iz0Var : tz0Var.d == 0.0f ? z10 ? wz0.S : wz0.T : wz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tz0.class != obj.getClass()) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        return this.c.equals(tz0Var.c) && this.b.equals(tz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
