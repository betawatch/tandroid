package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        j5 j5Var = (j5) this.a.remove(i10);
        HashMap hashMap = this.b;
        m5 m5Var = (m5) hashMap.get(j5Var.c);
        if (m5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = m5Var.b;
        arrayList.remove(j5Var);
        m5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(j5Var.c);
            this.c.remove(m5Var);
        }
        f5 f5Var = j5Var.f;
        if (f5Var != null) {
            f5Var.o(j5Var);
        }
    }
}
