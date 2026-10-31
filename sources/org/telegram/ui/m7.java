package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m7 extends hg.b {
    public s6 c;
    public sh.a d;

    public final boolean equals(Object obj) {
        sh.a aVar;
        sh.a aVar2;
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
