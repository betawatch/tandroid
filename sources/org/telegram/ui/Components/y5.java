package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((x5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        x5 x5Var = (x5) this.a.remove(i10);
        HashMap hashMap = this.b;
        a6 a6Var = (a6) hashMap.get(x5Var.c);
        if (a6Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = a6Var.b;
        arrayList.remove(x5Var);
        a6Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(x5Var.c);
            this.c.remove(a6Var);
        }
        t5 t5Var = x5Var.f;
        if (t5Var != null) {
            t5Var.p(x5Var);
        }
    }
}
