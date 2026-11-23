package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l7 extends rg.a {
    public r6 c;
    public ei.b d;

    public final boolean equals(Object obj) {
        ei.b bVar;
        ei.b bVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i7 = this.a;
            if (i7 == l7Var.a) {
                if (i7 == 1 && (r6Var = this.c) != null && (r6Var2 = l7Var.c) != null) {
                    return r6Var.a == r6Var2.a;
                }
                if (i7 == 2 && (bVar = this.d) != null && (bVar2 = l7Var.d) != null) {
                    return Objects.equals(bVar.a, bVar2.a);
                }
            }
        }
        return false;
    }
}
