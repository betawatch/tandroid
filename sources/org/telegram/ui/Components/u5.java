package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((t5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        t5 t5Var = (t5) this.a.remove(i7);
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
            p5Var.o(t5Var);
        }
    }
}
