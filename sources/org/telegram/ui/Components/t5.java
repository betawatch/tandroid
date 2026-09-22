package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((s5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        s5 s5Var = (s5) this.a.remove(i10);
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
            o5Var.p(s5Var);
        }
    }
}
