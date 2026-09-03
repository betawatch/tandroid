package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // org.telegram.ui.Components.ql0
    public boolean D(f2.l1 l1Var) {
        return !(this instanceof s7);
    }

    @Override // org.telegram.ui.j7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        mh.b bVar = this.h.f;
        if (bVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? bVar.d : i10 == 2 ? bVar.e : i10 == 3 ? bVar.f : i10 == 5 ? bVar.g : i10 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    mh.a aVar = (mh.a) arrayList3.get(i11);
                    q7 q7Var = new q7(2, true);
                    q7Var.d = aVar;
                    arrayList2.add(q7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
