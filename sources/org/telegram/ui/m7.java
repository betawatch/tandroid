package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m7 extends rg.a {
    public s6 c;
    public ei.b d;

    public final boolean equals(Object obj) {
        ei.b bVar;
        ei.b bVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i7 = this.a;
            if (i7 == m7Var.a) {
                if (i7 == 1 && (s6Var = this.c) != null && (s6Var2 = m7Var.c) != null) {
                    return s6Var.a == s6Var2.a;
                }
                if (i7 == 2 && (bVar = this.d) != null && (bVar2 = m7Var.d) != null) {
                    return Objects.equals(bVar.a, bVar2.a);
                }
            }
        }
        return false;
    }
}
