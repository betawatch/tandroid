package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class m7 extends pg.a {
    public s6 c;
    public ai.b d;

    public final boolean equals(Object obj) {
        ai.b bVar;
        ai.b bVar2;
        s6 s6Var;
        s6 s6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.a;
            if (i10 == m7Var.a) {
                if (i10 == 1 && (s6Var = this.c) != null && (s6Var2 = m7Var.c) != null) {
                    return s6Var.a == s6Var2.a;
                }
                if (i10 == 2 && (bVar = this.d) != null && (bVar2 = m7Var.d) != null) {
                    return Objects.equals(bVar.a, bVar2.a);
                }
            }
        }
        return false;
    }
}
