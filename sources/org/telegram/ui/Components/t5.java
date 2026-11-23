package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((s5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        s5 s5Var = (s5) this.a.remove(i7);
        HashMap hashMap = this.b;
        v5 v5Var = (v5) hashMap.get(s5Var.c);
        if (v5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = v5Var.b;
        arrayList.remove(s5Var);
        v5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(s5Var.c);
            this.c.remove(v5Var);
        }
        o5 o5Var = s5Var.f;
        if (o5Var != null) {
            o5Var.o(s5Var);
        }
    }
}
