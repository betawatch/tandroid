package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class g7 extends f7 {
    public final ArrayList f;
    public final /* synthetic */ s7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(s7 s7Var, int i10) {
        super(i10);
        this.h = s7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.kl0
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
        ai.c cVar = this.h.f;
        if (cVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? cVar.d : i10 == 2 ? cVar.e : i10 == 3 ? cVar.f : i10 == 5 ? cVar.g : i10 == 4 ? cVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ai.b bVar = (ai.b) arrayList3.get(i11);
                    m7 m7Var = new m7(2, true);
                    m7Var.d = bVar;
                    arrayList2.add(m7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
