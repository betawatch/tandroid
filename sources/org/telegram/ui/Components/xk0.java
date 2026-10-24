package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xk0 extends pg.a {
    public final ah.i1 c;

    public xk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xk0.class == obj.getClass()) {
            xk0 xk0Var = (xk0) obj;
            int i10 = this.a;
            int i11 = xk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.c;
                return i1Var != null && i1Var.equals(xk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
