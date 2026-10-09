package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class f7 extends e7 {
    public final ArrayList f;
    public final /* synthetic */ r7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(r7 r7Var, int i10) {
        super(i10);
        this.h = r7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.pm0
    public boolean D(s4.d1 d1Var) {
        return !(this instanceof n7);
    }

    @Override // org.telegram.ui.e7
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
                    l7 l7Var = new l7(2, true);
                    l7Var.d = aVar;
                    arrayList2.add(l7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
