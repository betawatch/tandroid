package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e01 {
    public static final e01 e = new e01(false, new b01(TLObject.FLAG_31, -2147483647), h01.R, 0.0f);
    public final boolean a;
    public final b01 b;
    public final tz0 c;
    public final float d;

    public e01(boolean z10, b01 b01Var, tz0 tz0Var, float f7) {
        this.a = z10;
        this.b = b01Var;
        this.c = tz0Var;
        this.d = f7;
    }

    public static tz0 a(e01 e01Var, boolean z10) {
        tz0 tz0Var = e01Var.c;
        return tz0Var != h01.R ? tz0Var : e01Var.d == 0.0f ? z10 ? h01.S : h01.T : h01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e01.class != obj.getClass()) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return this.c.equals(e01Var.c) && this.b.equals(e01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
