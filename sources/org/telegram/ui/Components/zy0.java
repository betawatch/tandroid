package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zy0 {
    public static final zy0 e = new zy0(false, new wy0(TLObject.FLAG_31, -2147483647), cz0.N, 0.0f);
    public final boolean a;
    public final wy0 b;
    public final oy0 c;
    public final float d;

    public zy0(boolean z10, wy0 wy0Var, oy0 oy0Var, float f9) {
        this.a = z10;
        this.b = wy0Var;
        this.c = oy0Var;
        this.d = f9;
    }

    public static oy0 a(zy0 zy0Var, boolean z10) {
        oy0 oy0Var = zy0Var.c;
        return oy0Var != cz0.N ? oy0Var : zy0Var.d == 0.0f ? z10 ? cz0.O : cz0.P : cz0.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy0.class != obj.getClass()) {
            return false;
        }
        zy0 zy0Var = (zy0) obj;
        return this.c.equals(zy0Var.c) && this.b.equals(zy0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
