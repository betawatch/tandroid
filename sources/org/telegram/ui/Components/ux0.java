package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ux0 {
    public static final ux0 e = new ux0(false, new rx0(TLObject.FLAG_31, -2147483647), xx0.T, 0.0f);
    public final boolean a;
    public final rx0 b;
    public final jx0 c;
    public final float d;

    public ux0(boolean z10, rx0 rx0Var, jx0 jx0Var, float f10) {
        this.a = z10;
        this.b = rx0Var;
        this.c = jx0Var;
        this.d = f10;
    }

    public static jx0 a(ux0 ux0Var, boolean z10) {
        jx0 jx0Var = ux0Var.c;
        return jx0Var != xx0.T ? jx0Var : ux0Var.d == 0.0f ? z10 ? xx0.U : xx0.V : xx0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ux0.class != obj.getClass()) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        return this.c.equals(ux0Var.c) && this.b.equals(ux0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
