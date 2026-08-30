package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class i7 extends h7 {
    public final ArrayList f;
    public final /* synthetic */ u7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(u7 u7Var, int i10) {
        super(i10);
        this.h = u7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.rl0
    public boolean D(f2.l1 l1Var) {
        return !(this instanceof q7);
    }

    @Override // org.telegram.ui.h7
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
                    o7 o7Var = new o7(2, true);
                    o7Var.d = aVar;
                    arrayList2.add(o7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
