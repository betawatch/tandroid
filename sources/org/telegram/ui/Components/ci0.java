package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ci0 extends sg.a {
    public final dh.n0 c;

    public ci0(int i3, dh.n0 n0Var) {
        super(i3, false);
        this.c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ci0.class == obj.getClass()) {
            ci0 ci0Var = (ci0) obj;
            int i3 = this.a;
            int i10 = ci0Var.a;
            if (i3 == i10 && (i3 == 0 || i3 == 3)) {
                dh.n0 n0Var = this.c;
                return n0Var != null && n0Var.equals(ci0Var.c);
            }
            if (i3 == i10) {
                return true;
            }
        }
        return false;
    }
}
