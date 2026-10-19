package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class w5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        v5 v5Var = (v5) this.a.remove(i10);
        HashMap hashMap = this.b;
        y5 y5Var = (y5) hashMap.get(v5Var.c);
        if (y5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = y5Var.b;
        arrayList.remove(v5Var);
        y5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(v5Var.c);
            this.c.remove(y5Var);
        }
        r5 r5Var = v5Var.f;
        if (r5Var != null) {
            r5Var.p(v5Var);
        }
    }
}
