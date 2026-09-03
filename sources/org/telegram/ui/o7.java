package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o7 extends cg.b {
    public u6 c;
    public nh.a d;

    public final boolean equals(Object obj) {
        nh.a aVar;
        nh.a aVar2;
        u6 u6Var;
        u6 u6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o7.class == obj.getClass()) {
            o7 o7Var = (o7) obj;
            int i10 = this.a;
            if (i10 == o7Var.a) {
                if (i10 == 1 && (u6Var = this.c) != null && (u6Var2 = o7Var.c) != null) {
                    return u6Var.a == u6Var2.a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
