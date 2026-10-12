package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q7 extends pg.a {
    public w6 c;
    public ai.b d;

    public final boolean equals(Object obj) {
        ai.b bVar;
        ai.b bVar2;
        w6 w6Var;
        w6 w6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && q7.class == obj.getClass()) {
            q7 q7Var = (q7) obj;
            int i10 = this.a;
            if (i10 == q7Var.a) {
                if (i10 == 1 && (w6Var = this.c) != null && (w6Var2 = q7Var.c) != null) {
                    return w6Var.a == w6Var2.a;
                }
                if (i10 == 2 && (bVar = this.d) != null && (bVar2 = q7Var.d) != null) {
                    return Objects.equals(bVar.a, bVar2.a);
                }
            }
        }
        return false;
    }
}
