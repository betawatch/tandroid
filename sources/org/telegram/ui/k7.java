package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k7 extends zf.a {
    public q6 c;
    public kh.a d;

    public final boolean equals(Object obj) {
        kh.a aVar;
        kh.a aVar2;
        q6 q6Var;
        q6 q6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && k7.class == obj.getClass()) {
            k7 k7Var = (k7) obj;
            int i10 = this.a;
            if (i10 == k7Var.a) {
                if (i10 == 1 && (q6Var = this.c) != null && (q6Var2 = k7Var.c) != null) {
                    return q6Var.a == q6Var2.a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = k7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
