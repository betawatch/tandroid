package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oy0 {
    public static final oy0 e = new oy0(false, new ly0(TLObject.FLAG_31, -2147483647), ry0.N, 0.0f);
    public final boolean a;
    public final ly0 b;
    public final dy0 c;
    public final float d;

    public oy0(boolean z10, ly0 ly0Var, dy0 dy0Var, float f10) {
        this.a = z10;
        this.b = ly0Var;
        this.c = dy0Var;
        this.d = f10;
    }

    public static dy0 a(oy0 oy0Var, boolean z10) {
        dy0 dy0Var = oy0Var.c;
        return dy0Var != ry0.N ? dy0Var : oy0Var.d == 0.0f ? z10 ? ry0.O : ry0.P : ry0.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy0.class != obj.getClass()) {
            return false;
        }
        oy0 oy0Var = (oy0) obj;
        return this.c.equals(oy0Var.c) && this.b.equals(oy0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
