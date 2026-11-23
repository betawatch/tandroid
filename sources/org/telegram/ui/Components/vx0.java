package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vx0 {
    public static final vx0 e = new vx0(false, new sx0(TLObject.FLAG_31, -2147483647), yx0.T, 0.0f);
    public final boolean a;
    public final sx0 b;
    public final kx0 c;
    public final float d;

    public vx0(boolean z10, sx0 sx0Var, kx0 kx0Var, float f10) {
        this.a = z10;
        this.b = sx0Var;
        this.c = kx0Var;
        this.d = f10;
    }

    public static kx0 a(vx0 vx0Var, boolean z10) {
        kx0 kx0Var = vx0Var.c;
        return kx0Var != yx0.T ? kx0Var : vx0Var.d == 0.0f ? z10 ? yx0.U : yx0.V : yx0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vx0.class != obj.getClass()) {
            return false;
        }
        vx0 vx0Var = (vx0) obj;
        return this.c.equals(vx0Var.c) && this.b.equals(vx0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
