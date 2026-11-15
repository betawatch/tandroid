package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((k5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        k5 k5Var = (k5) this.a.remove(i7);
        HashMap hashMap = this.b;
        n5 n5Var = (n5) hashMap.get(k5Var.c);
        if (n5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = n5Var.b;
        arrayList.remove(k5Var);
        n5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(k5Var.c);
            this.c.remove(n5Var);
        }
        g5 g5Var = k5Var.f;
        if (g5Var != null) {
            g5Var.o(k5Var);
        }
    }
}
