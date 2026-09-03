package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q7 extends bg.b {
    public w6 c;
    public mh.a d;

    public final boolean equals(Object obj) {
        mh.a aVar;
        mh.a aVar2;
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
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = q7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
