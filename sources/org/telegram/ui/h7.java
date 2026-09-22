package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class h7 extends g7 {
    public final ArrayList f;
    public final /* synthetic */ t7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(t7 t7Var, int i10) {
        super(i10);
        this.h = t7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.xl0
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof p7);
    }

    @Override // org.telegram.ui.g7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        zh.b bVar = this.h.f;
        if (bVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? bVar.d : i10 == 2 ? bVar.e : i10 == 3 ? bVar.f : i10 == 5 ? bVar.g : i10 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    zh.a aVar = (zh.a) arrayList3.get(i11);
                    n7 n7Var = new n7(2, true);
                    n7Var.d = aVar;
                    arrayList2.add(n7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
