package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class k7 extends j7 {
    public final ArrayList f;
    public final /* synthetic */ w7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(w7 w7Var, int i10) {
        super(i10);
        this.h = w7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.lm0
    public boolean D(s4.b1 b1Var) {
        return !(this instanceof s7);
    }

    @Override // org.telegram.ui.j7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ai.c cVar = this.h.f;
        if (cVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? cVar.d : i10 == 2 ? cVar.e : i10 == 3 ? cVar.f : i10 == 5 ? cVar.g : i10 == 4 ? cVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ai.b bVar = (ai.b) arrayList3.get(i11);
                    q7 q7Var = new q7(2, true);
                    q7Var.d = bVar;
                    arrayList2.add(q7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
