package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kz0 {
    public static final kz0 e = new kz0(false, new hz0(TLObject.FLAG_31, -2147483647), nz0.O, 0.0f);
    public final boolean a;
    public final hz0 b;
    public final zy0 c;
    public final float d;

    public kz0(boolean z4, hz0 hz0Var, zy0 zy0Var, float f10) {
        this.a = z4;
        this.b = hz0Var;
        this.c = zy0Var;
        this.d = f10;
    }

    public static zy0 a(kz0 kz0Var, boolean z4) {
        zy0 zy0Var = kz0Var.c;
        return zy0Var != nz0.O ? zy0Var : kz0Var.d == 0.0f ? z4 ? nz0.P : nz0.Q : nz0.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kz0.class != obj.getClass()) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        return this.c.equals(kz0Var.c) && this.b.equals(kz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
