package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q7 extends qg.a {
    public w6 c;
    public ci.a d;

    public final boolean equals(Object obj) {
        ci.a aVar;
        ci.a aVar2;
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
