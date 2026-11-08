package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((m5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        m5 m5Var = (m5) this.a.remove(i7);
        HashMap hashMap = this.b;
        p5 p5Var = (p5) hashMap.get(m5Var.c);
        if (p5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = p5Var.b;
        arrayList.remove(m5Var);
        p5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(m5Var.c);
            this.c.remove(p5Var);
        }
        i5 i5Var = m5Var.f;
        if (i5Var != null) {
            i5Var.o(m5Var);
        }
    }
}
