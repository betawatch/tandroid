package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((p5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        p5 p5Var = (p5) this.a.remove(i10);
        HashMap hashMap = this.b;
        s5 s5Var = (s5) hashMap.get(p5Var.c);
        if (s5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = s5Var.b;
        arrayList.remove(p5Var);
        s5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(p5Var.c);
            this.c.remove(s5Var);
        }
        l5 l5Var = p5Var.f;
        if (l5Var != null) {
            l5Var.p(p5Var);
        }
    }
}
