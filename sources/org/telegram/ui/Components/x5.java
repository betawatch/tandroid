package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((w5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        w5 w5Var = (w5) this.a.remove(i10);
        HashMap hashMap = this.b;
        z5 z5Var = (z5) hashMap.get(w5Var.c);
        if (z5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = z5Var.b;
        arrayList.remove(w5Var);
        z5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(w5Var.c);
            this.c.remove(z5Var);
        }
        s5 s5Var = w5Var.f;
        if (s5Var != null) {
            s5Var.p(w5Var);
        }
    }
}
