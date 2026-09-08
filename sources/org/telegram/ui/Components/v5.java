package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((u5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        u5 u5Var = (u5) this.a.remove(i10);
        HashMap hashMap = this.b;
        x5 x5Var = (x5) hashMap.get(u5Var.c);
        if (x5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = x5Var.b;
        arrayList.remove(u5Var);
        x5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(u5Var.c);
            this.c.remove(x5Var);
        }
        q5 q5Var = u5Var.f;
        if (q5Var != null) {
            q5Var.p(u5Var);
        }
    }
}
