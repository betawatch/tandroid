package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class p7 extends pg.a {
    public v6 c;
    public bi.b d;

    public final boolean equals(Object obj) {
        bi.b bVar;
        bi.b bVar2;
        v6 v6Var;
        v6 v6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && p7.class == obj.getClass()) {
            p7 p7Var = (p7) obj;
            int i10 = this.a;
            if (i10 == p7Var.a) {
                if (i10 == 1 && (v6Var = this.c) != null && (v6Var2 = p7Var.c) != null) {
                    return v6Var.a == v6Var2.a;
                }
                if (i10 == 2 && (bVar = this.d) != null && (bVar2 = p7Var.d) != null) {
                    return Objects.equals(bVar.a, bVar2.a);
                }
            }
        }
        return false;
    }
}
