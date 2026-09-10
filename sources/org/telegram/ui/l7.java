package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l7 extends ng.a {
    public r6 c;
    public yh.a d;

    public final boolean equals(Object obj) {
        yh.a aVar;
        yh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i10 = this.a;
            if (i10 == l7Var.a) {
                if (i10 == 1 && (r6Var = this.c) != null && (r6Var2 = l7Var.c) != null) {
                    return r6Var.a == r6Var2.a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = l7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
