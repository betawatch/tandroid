package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n7 extends sg.a {
    public t6 c;
    public di.b d;

    public final boolean equals(Object obj) {
        di.b bVar;
        di.b bVar2;
        t6 t6Var;
        t6 t6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && n7.class == obj.getClass()) {
            n7 n7Var = (n7) obj;
            int i3 = this.a;
            if (i3 == n7Var.a) {
                if (i3 == 1 && (t6Var = this.c) != null && (t6Var2 = n7Var.c) != null) {
                    return t6Var.a == t6Var2.a;
                }
                if (i3 == 2 && (bVar = this.d) != null && (bVar2 = n7Var.d) != null) {
                    return Objects.equals(bVar.a, bVar2.a);
                }
            }
        }
        return false;
    }
}
