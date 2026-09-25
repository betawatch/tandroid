package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rz0 {
    public static final rz0 e = new rz0(false, new oz0(TLObject.FLAG_31, -2147483647), uz0.R, 0.0f);
    public final boolean a;
    public final oz0 b;
    public final gz0 c;
    public final float d;

    public rz0(boolean z10, oz0 oz0Var, gz0 gz0Var, float f7) {
        this.a = z10;
        this.b = oz0Var;
        this.c = gz0Var;
        this.d = f7;
    }

    public static gz0 a(rz0 rz0Var, boolean z10) {
        gz0 gz0Var = rz0Var.c;
        return gz0Var != uz0.R ? gz0Var : rz0Var.d == 0.0f ? z10 ? uz0.S : uz0.T : uz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        return this.c.equals(rz0Var.c) && this.b.equals(rz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
