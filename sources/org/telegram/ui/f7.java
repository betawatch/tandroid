package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    @Override // org.telegram.ui.Components.ul0
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof n7);
    }

    @Override // org.telegram.ui.e7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        yh.b bVar = this.h.f;
        if (bVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? bVar.d : i10 == 2 ? bVar.e : i10 == 3 ? bVar.f : i10 == 5 ? bVar.g : i10 == 4 ? bVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    yh.a aVar = (yh.a) arrayList3.get(i11);
                    l7 l7Var = new l7(2, true);
                    l7Var.d = aVar;
                    arrayList2.add(l7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
