package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p5 {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((o5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        o5 o5Var = (o5) this.a.remove(i10);
        HashMap hashMap = this.b;
        r5 r5Var = (r5) hashMap.get(o5Var.c);
        if (r5Var == null) {
            throw new RuntimeException("!!!");
        }
        ArrayList arrayList = r5Var.b;
        arrayList.remove(o5Var);
        r5Var.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(o5Var.c);
            this.c.remove(r5Var);
        }
        k5 k5Var = o5Var.f;
        if (k5Var != null) {
            k5Var.p(o5Var);
        }
    }
}
