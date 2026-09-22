package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m7 extends og.a {
    public s6 c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
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
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
