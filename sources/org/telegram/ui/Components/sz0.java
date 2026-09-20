package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class sz0 {
    public static final sz0 e = new sz0(false, new pz0(TLObject.FLAG_31, -2147483647), vz0.R, 0.0f);
    public final boolean a;
    public final pz0 b;
    public final hz0 c;
    public final float d;

    public sz0(boolean z10, pz0 pz0Var, hz0 hz0Var, float f7) {
        this.a = z10;
        this.b = pz0Var;
        this.c = hz0Var;
        this.d = f7;
    }

    public static hz0 a(sz0 sz0Var, boolean z10) {
        hz0 hz0Var = sz0Var.c;
        return hz0Var != vz0.R ? hz0Var : sz0Var.d == 0.0f ? z10 ? vz0.S : vz0.T : vz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return this.c.equals(sz0Var.c) && this.b.equals(sz0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
