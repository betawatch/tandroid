package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class my0 {
    public static final my0 e = new my0(false, new jy0(TLObject.FLAG_31, -2147483647), py0.R, 0.0f);
    public final boolean a;
    public final jy0 b;
    public final by0 c;
    public final float d;

    public my0(boolean z10, jy0 jy0Var, by0 by0Var, float f7) {
        this.a = z10;
        this.b = jy0Var;
        this.c = by0Var;
        this.d = f7;
    }

    public static by0 a(my0 my0Var, boolean z10) {
        by0 by0Var = my0Var.c;
        return by0Var != py0.R ? by0Var : my0Var.d == 0.0f ? z10 ? py0.S : py0.T : py0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || my0.class != obj.getClass()) {
            return false;
        }
        my0 my0Var = (my0) obj;
        return this.c.equals(my0Var.c) && this.b.equals(my0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
