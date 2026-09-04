package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
