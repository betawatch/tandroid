package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class wj0 extends pg.a {
    public final ah.j1 c;

    public wj0(int i10, ah.j1 j1Var) {
        super(i10, false);
        this.c = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj0.class == obj.getClass()) {
            wj0 wj0Var = (wj0) obj;
            int i10 = this.a;
            int i11 = wj0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.j1 j1Var = this.c;
                return j1Var != null && j1Var.equals(wj0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
