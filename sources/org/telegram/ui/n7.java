package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n7 extends og.a {
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
        if (obj != null && n7.class == obj.getClass()) {
            n7 n7Var = (n7) obj;
            int i10 = this.a;
            if (i10 == n7Var.a) {
                if (i10 == 1 && (s6Var = this.c) != null && (s6Var2 = n7Var.c) != null) {
                    return s6Var.a == s6Var2.a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = n7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
