package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l7 extends wf.a {
    public r6 c;
    public hh.a d;

    public final boolean equals(Object obj) {
        hh.a aVar;
        hh.a aVar2;
        r6 r6Var;
        r6 r6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            int i9 = this.a;
            if (i9 == l7Var.a) {
                if (i9 == 1 && (r6Var = this.c) != null && (r6Var2 = l7Var.c) != null) {
                    return r6Var.a == r6Var2.a;
                }
                if (i9 == 2 && (aVar = this.d) != null && (aVar2 = l7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
