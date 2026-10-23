package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class uk0 extends pg.a {
    public final ah.i1 c;

    public uk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uk0.class == obj.getClass()) {
            uk0 uk0Var = (uk0) obj;
            int i10 = this.a;
            int i11 = uk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.c;
                return i1Var != null && i1Var.equals(uk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
