package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class m7 extends og.a {
    public r6 c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            int i10 = this.a;
            if (i10 == m7Var.a) {
                if (i10 == 1 && (r6Var = this.c) != null && (r6Var2 = m7Var.c) != null) {
                    return r6Var.a == r6Var2.a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = m7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
