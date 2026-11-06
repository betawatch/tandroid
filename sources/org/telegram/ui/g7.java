package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class g7 extends f7 {
    public final ArrayList f;
    public final /* synthetic */ t7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(t7 t7Var, int i7) {
        super(i7);
        this.h = t7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.oj0
    public boolean D(v4.d1 d1Var) {
        return !(this instanceof o7);
    }

    @Override // org.telegram.ui.f7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ci.c cVar = this.h.h;
        if (cVar != null) {
            int i7 = this.d;
            ArrayList arrayList3 = i7 == 1 ? cVar.d : i7 == 2 ? cVar.e : i7 == 3 ? cVar.f : i7 == 5 ? cVar.g : i7 == 4 ? cVar.h : null;
            if (arrayList3 != null) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    ci.b bVar = (ci.b) arrayList3.get(i10);
                    m7 m7Var = new m7(2, true);
                    m7Var.d = bVar;
                    arrayList2.add(m7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
