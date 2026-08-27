package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nj0 extends xf.a {
    public final ig.q0 c;

    public nj0(int i10, ig.q0 q0Var) {
        super(i10, false);
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nj0.class == obj.getClass()) {
            nj0 nj0Var = (nj0) obj;
            int i10 = this.a;
            int i11 = nj0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ig.q0 q0Var = this.c;
                return q0Var != null && q0Var.equals(nj0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
