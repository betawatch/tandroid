package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
