package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class a01 {
    public static final a01 e = new a01(false, new xz0(TLObject.FLAG_31, -2147483647), d01.R, 0.0f);
    public final boolean a;
    public final xz0 b;
    public final pz0 c;
    public final float d;

    public a01(boolean z10, xz0 xz0Var, pz0 pz0Var, float f7) {
        this.a = z10;
        this.b = xz0Var;
        this.c = pz0Var;
        this.d = f7;
    }

    public static pz0 a(a01 a01Var, boolean z10) {
        pz0 pz0Var = a01Var.c;
        return pz0Var != d01.R ? pz0Var : a01Var.d == 0.0f ? z10 ? d01.S : d01.T : d01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        return this.c.equals(a01Var.c) && this.b.equals(a01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
