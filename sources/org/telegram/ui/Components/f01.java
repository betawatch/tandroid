package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class f01 {
    public static final f01 e = new f01(false, new c01(TLObject.FLAG_31, -2147483647), i01.R, 0.0f);
    public final boolean a;
    public final c01 b;
    public final uz0 c;
    public final float d;

    public f01(boolean z10, c01 c01Var, uz0 uz0Var, float f7) {
        this.a = z10;
        this.b = c01Var;
        this.c = uz0Var;
        this.d = f7;
    }

    public static uz0 a(f01 f01Var, boolean z10) {
        uz0 uz0Var = f01Var.c;
        return uz0Var != i01.R ? uz0Var : f01Var.d == 0.0f ? z10 ? i01.S : i01.T : i01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f01.class != obj.getClass()) {
            return false;
        }
        f01 f01Var = (f01) obj;
        return this.c.equals(f01Var.c) && this.b.equals(f01Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
