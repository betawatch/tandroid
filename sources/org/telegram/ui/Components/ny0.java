package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ny0 {
    public static final ny0 e = new ny0(false, new ky0(TLObject.FLAG_31, -2147483647), qy0.R, 0.0f);
    public final boolean a;
    public final ky0 b;
    public final cy0 c;
    public final float d;

    public ny0(boolean z10, ky0 ky0Var, cy0 cy0Var, float f7) {
        this.a = z10;
        this.b = ky0Var;
        this.c = cy0Var;
        this.d = f7;
    }

    public static cy0 a(ny0 ny0Var, boolean z10) {
        cy0 cy0Var = ny0Var.c;
        return cy0Var != qy0.R ? cy0Var : ny0Var.d == 0.0f ? z10 ? qy0.S : qy0.T : qy0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ny0.class != obj.getClass()) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return this.c.equals(ny0Var.c) && this.b.equals(ny0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
