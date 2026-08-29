package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        t5 t5Var = (t5) this.a.remove(i10);
        HashMap hashMap = this.b;
        w5 w5Var = (w5) hashMap.get(t5Var.c);
        if (w5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = w5Var.b;
        arrayList.remove(t5Var);
        w5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(t5Var.c);
            this.c.remove(w5Var);
        }
        p5 p5Var = t5Var.f;
        if (p5Var != null) {
            p5Var.p(t5Var);
        }
    }
}
