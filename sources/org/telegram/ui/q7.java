package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
