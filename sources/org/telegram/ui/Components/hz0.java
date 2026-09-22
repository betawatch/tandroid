package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hz0 {
    public static final hz0 e = new hz0(false, new ez0(TLObject.FLAG_31, -2147483647), kz0.R, 0.0f);
    public final boolean a;
    public final ez0 b;
    public final wy0 c;
    public final float d;

    public hz0(boolean z10, ez0 ez0Var, wy0 wy0Var, float f7) {
        this.a = z10;
        this.b = ez0Var;
        this.c = wy0Var;
        this.d = f7;
    }

    public static wy0 a(hz0 hz0Var, boolean z10) {
        wy0 wy0Var = hz0Var.c;
        return wy0Var != kz0.R ? wy0Var : hz0Var.d == 0.0f ? z10 ? kz0.S : kz0.T : kz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return this.c.equals(hz0Var.c) && this.b.equals(hz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
