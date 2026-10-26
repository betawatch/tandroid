package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n01 {
    public static final n01 e = new n01(false, new k01(TLObject.FLAG_31, -2147483647), q01.R, 0.0f);
    public final boolean a;
    public final k01 b;
    public final gb1 c;
    public final float d;

    public n01(boolean z10, k01 k01Var, gb1 gb1Var, float f7) {
        this.a = z10;
        this.b = k01Var;
        this.c = gb1Var;
        this.d = f7;
    }

    public static gb1 a(n01 n01Var, boolean z10) {
        gb1 gb1Var = n01Var.c;
        return gb1Var != q01.R ? gb1Var : n01Var.d == 0.0f ? z10 ? q01.S : q01.T : q01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n01.class != obj.getClass()) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.c.equals(n01Var.c) && this.b.equals(n01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
