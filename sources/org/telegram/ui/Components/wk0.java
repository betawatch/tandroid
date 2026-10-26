package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wk0 extends qg.a {
    public final bh.x0 c;

    public wk0(int i10, bh.x0 x0Var) {
        super(i10, false);
        this.c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wk0.class == obj.getClass()) {
            wk0 wk0Var = (wk0) obj;
            int i10 = this.a;
            int i11 = wk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                bh.x0 x0Var = this.c;
                return x0Var != null && x0Var.equals(wk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
