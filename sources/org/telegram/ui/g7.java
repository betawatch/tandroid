package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class g7 extends f7 {
    public final ArrayList f;
    public final /* synthetic */ t7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(t7 t7Var, int i10) {
        super(i10);
        this.h = t7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof o7);
    }

    @Override // org.telegram.ui.f7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        sh.b bVar = this.h.h;
        if (bVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? bVar.d : i10 == 2 ? bVar.e : i10 == 3 ? bVar.f : i10 == 5 ? bVar.g : i10 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    sh.a aVar = (sh.a) arrayList3.get(i11);
                    m7 m7Var = new m7(2, true);
                    m7Var.d = aVar;
                    arrayList2.add(m7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
