package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o7 extends bg.b {
    public u6 c;
    public mh.a d;

    public final boolean equals(Object obj) {
        mh.a aVar;
        mh.a aVar2;
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
