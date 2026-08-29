package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class e7 extends d7 {
    public final ArrayList f;
    public final /* synthetic */ q7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(q7 q7Var, int i10) {
        super(i10);
        this.h = q7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.il0
    public boolean D(f2.n1 n1Var) {
        return !(this instanceof m7);
    }

    @Override // org.telegram.ui.d7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        kh.b bVar = this.h.f;
        if (bVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? bVar.d : i10 == 2 ? bVar.e : i10 == 3 ? bVar.f : i10 == 5 ? bVar.g : i10 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    kh.a aVar = (kh.a) arrayList3.get(i11);
                    k7 k7Var = new k7(2, true);
                    k7Var.d = aVar;
                    arrayList2.add(k7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
