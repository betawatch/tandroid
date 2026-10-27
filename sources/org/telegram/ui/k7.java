package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class k7 extends j7 {
    public final ArrayList f;
    public final /* synthetic */ x7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(x7 x7Var, int i10) {
        super(i10);
        this.h = x7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean D(s4.e1 e1Var) {
        return !(this instanceof s7);
    }

    @Override // org.telegram.ui.j7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ci.b bVar = this.h.h;
        if (bVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? bVar.d : i10 == 2 ? bVar.e : i10 == 3 ? bVar.f : i10 == 5 ? bVar.g : i10 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ci.a aVar = (ci.a) arrayList3.get(i11);
                    q7 q7Var = new q7(2, true);
                    q7Var.d = aVar;
                    arrayList2.add(q7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
