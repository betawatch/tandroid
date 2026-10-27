package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xk0 extends qg.a {
    public final bh.x0 c;

    public xk0(int i10, bh.x0 x0Var) {
        super(i10, false);
        this.c = x0Var;
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
                bh.x0 x0Var = this.c;
                return x0Var != null && x0Var.equals(xk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
