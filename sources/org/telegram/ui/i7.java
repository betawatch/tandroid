package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class i7 extends h7 {
    public final ArrayList f;
    public final /* synthetic */ v7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(v7 v7Var, int i10) {
        super(i10);
        this.h = v7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof q7);
    }

    @Override // org.telegram.ui.h7
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
                    o7 o7Var = new o7(2, true);
                    o7Var.d = aVar;
                    arrayList2.add(o7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
