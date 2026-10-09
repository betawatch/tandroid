package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bl0 extends og.a {
    public final zg.n0 c;

    public bl0(int i10, zg.n0 n0Var) {
        super(i10, false);
        this.c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bl0.class == obj.getClass()) {
            bl0 bl0Var = (bl0) obj;
            int i10 = this.a;
            int i11 = bl0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.n0 n0Var = this.c;
                return n0Var != null && n0Var.equals(bl0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
