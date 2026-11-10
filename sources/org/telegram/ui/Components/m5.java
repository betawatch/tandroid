package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((l5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        l5 l5Var = (l5) this.a.remove(i7);
        HashMap hashMap = this.b;
        o5 o5Var = (o5) hashMap.get(l5Var.c);
        if (o5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = o5Var.b;
        arrayList.remove(l5Var);
        o5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(l5Var.c);
            this.c.remove(o5Var);
        }
        h5 h5Var = l5Var.f;
        if (h5Var != null) {
            h5Var.o(l5Var);
        }
    }
}
