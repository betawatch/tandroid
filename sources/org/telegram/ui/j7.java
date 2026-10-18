package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class j7 extends i7 {
    public final ArrayList f;
    public final /* synthetic */ v7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(v7 v7Var, int i10) {
        super(i10);
        this.h = v7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean D(s4.b1 b1Var) {
        return !(this instanceof r7);
    }

    @Override // org.telegram.ui.i7
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        bi.c cVar = this.h.f;
        if (cVar != null) {
            int i10 = this.d;
            ArrayList arrayList3 = i10 == 1 ? cVar.d : i10 == 2 ? cVar.e : i10 == 3 ? cVar.f : i10 == 5 ? cVar.g : i10 == 4 ? cVar.h : null;
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    bi.b bVar = (bi.b) arrayList3.get(i11);
                    p7 p7Var = new p7(2, true);
                    p7Var.d = bVar;
                    arrayList2.add(p7Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
