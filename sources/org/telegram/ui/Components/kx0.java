package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kx0 {
    public static final kx0 e = new kx0(false, new hx0(TLObject.FLAG_31, -2147483647), nx0.S, 0.0f);
    public final boolean a;
    public final hx0 b;
    public final zw0 c;
    public final float d;

    public kx0(boolean z9, hx0 hx0Var, zw0 zw0Var, float f10) {
        this.a = z9;
        this.b = hx0Var;
        this.c = zw0Var;
        this.d = f10;
    }

    public static zw0 a(kx0 kx0Var, boolean z9) {
        zw0 zw0Var = kx0Var.c;
        return zw0Var != nx0.S ? zw0Var : kx0Var.d == 0.0f ? z9 ? nx0.T : nx0.U : nx0.V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx0.class != obj.getClass()) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        return this.c.equals(kx0Var.c) && this.b.equals(kx0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
