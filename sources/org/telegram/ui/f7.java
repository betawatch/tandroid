package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class f7 extends e7 {
    public final ArrayList f;
    public final /* synthetic */ s7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(s7 s7Var, int i7) {
        super(i7);
        this.h = s7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.dk0
    public boolean D(v4.f1 f1Var) {
        return !(this instanceof n7);
    }

    @Override // org.telegram.ui.e7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ei.c cVar = this.h.h;
        if (cVar != null) {
            int i7 = this.d;
            ArrayList arrayList3 = i7 == 1 ? cVar.d : i7 == 2 ? cVar.e : i7 == 3 ? cVar.f : i7 == 5 ? cVar.g : i7 == 4 ? cVar.h : null;
            if (arrayList3 != null) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    ei.b bVar = (ei.b) arrayList3.get(i10);
                    l7 l7Var = new l7(2, true);
                    l7Var.d = bVar;
                    arrayList2.add(l7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
