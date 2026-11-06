package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jx0 {
    public static final jx0 e = new jx0(false, new gx0(TLObject.FLAG_31, -2147483647), mx0.S, 0.0f);
    public final boolean a;
    public final gx0 b;
    public final yw0 c;
    public final float d;

    public jx0(boolean z9, gx0 gx0Var, yw0 yw0Var, float f10) {
        this.a = z9;
        this.b = gx0Var;
        this.c = yw0Var;
        this.d = f10;
    }

    public static yw0 a(jx0 jx0Var, boolean z9) {
        yw0 yw0Var = jx0Var.c;
        return yw0Var != mx0.S ? yw0Var : jx0Var.d == 0.0f ? z9 ? mx0.T : mx0.U : mx0.V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jx0.class != obj.getClass()) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        return this.c.equals(jx0Var.c) && this.b.equals(jx0Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
