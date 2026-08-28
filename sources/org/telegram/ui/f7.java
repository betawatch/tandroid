package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class f7 extends e7 {
    public final ArrayList f;
    public final /* synthetic */ r7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(r7 r7Var, int i9) {
        super(i9);
        this.h = r7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.vk0
    public boolean D(f2.q1 q1Var) {
        return !(this instanceof n7);
    }

    @Override // org.telegram.ui.e7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        hh.b bVar = this.h.f;
        if (bVar != null) {
            int i9 = this.d;
            ArrayList arrayList3 = i9 == 1 ? bVar.d : i9 == 2 ? bVar.e : i9 == 3 ? bVar.f : i9 == 5 ? bVar.g : i9 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    hh.a aVar = (hh.a) arrayList3.get(i10);
                    l7 l7Var = new l7(2, true);
                    l7Var.d = aVar;
                    arrayList2.add(l7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
