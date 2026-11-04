package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class h7 extends g7 {
    public final ArrayList f;
    public final /* synthetic */ u7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(u7 u7Var, int i3) {
        super(i3);
        this.h = u7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean D(u4.d1 d1Var) {
        return !(this instanceof p7);
    }

    @Override // org.telegram.ui.g7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        di.c cVar = this.h.h;
        if (cVar != null) {
            int i3 = this.d;
            ArrayList arrayList3 = i3 == 1 ? cVar.d : i3 == 2 ? cVar.e : i3 == 3 ? cVar.f : i3 == 5 ? cVar.g : i3 == 4 ? cVar.h : null;
            if (arrayList3 != null) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    di.b bVar = (di.b) arrayList3.get(i10);
                    n7 n7Var = new n7(2, true);
                    n7Var.d = bVar;
                    arrayList2.add(n7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
