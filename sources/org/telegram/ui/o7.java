package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o7 extends og.a {
    public t6 c;
    public zh.a d;

    public final boolean equals(Object obj) {
        zh.a aVar;
        zh.a aVar2;
        t6 t6Var;
        t6 t6Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && o7.class == obj.getClass()) {
            o7 o7Var = (o7) obj;
            int i10 = this.a;
            if (i10 == o7Var.a) {
                if (i10 == 1 && (t6Var = this.c) != null && (t6Var2 = o7Var.c) != null) {
                    return t6Var.a == t6Var2.a;
                }
                if (i10 == 2 && (aVar = this.d) != null && (aVar2 = o7Var.d) != null) {
                    return Objects.equals(aVar.a, aVar2.a);
                }
            }
        }
        return false;
    }
}
