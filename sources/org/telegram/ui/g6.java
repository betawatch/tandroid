package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g6 implements org.telegram.ui.Components.qt0, h7 {
    public final /* synthetic */ x6 a;

    public /* synthetic */ g6(x6 x6Var) {
        this.a = x6Var;
    }

    @Override // org.telegram.ui.Components.qt0
    public void G(boolean z10) {
        te.a aVar = this.a.U;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.qt0
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(this.a.Q), 0);
    }

    @Override // org.telegram.ui.h7
    public void clear() {
        x6.k0(this.a);
    }

    @Override // org.telegram.ui.Components.qt0
    public int j1() {
        return this.a.R;
    }

    @Override // org.telegram.ui.h7
    public void k() {
        x6 x6Var = this.a;
        ei.c cVar = x6Var.e0;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        x6Var.e0.d();
        i6 i6Var = x6Var.N;
        if (i6Var != null) {
            i6Var.f(false);
            x6Var.N.e();
        }
    }

    @Override // org.telegram.ui.h7
    public void m(r6 r6Var, ei.b bVar, boolean z10) {
        HashSet hashSet;
        x6 x6Var = this.a;
        if (r6Var == null) {
            if (bVar != null) {
                x6Var.e0.i(bVar);
                x6Var.N.e();
                x6.i0(x6Var);
                return;
            }
            return;
        }
        if (x6Var.e0.j.size() > 0 || z10) {
            ei.c cVar = x6Var.e0;
            HashSet hashSet2 = cVar.j;
            HashSet hashSet3 = cVar.l;
            long j3 = r6Var.a;
            SparseArray sparseArray = r6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    ArrayList arrayList = ((s6) sparseArray.valueAt(i7)).b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ei.b bVar2 = (ei.b) obj;
                        if (hashSet2.remove(bVar2)) {
                            cVar.k -= bVar2.c;
                        }
                    }
                }
            } else {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    ArrayList arrayList2 = ((s6) sparseArray.valueAt(i11)).b;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        ei.b bVar3 = (ei.b) obj2;
                        if (hashSet2.add(bVar3)) {
                            cVar.k += bVar3.c;
                        }
                    }
                }
            }
            cVar.c();
            x6Var.N.e();
            x6.i0(x6Var);
            return;
        }
        if (x6Var.H <= 0 || x6Var.getParentActivity() == null) {
            return;
        }
        r6Var.getClass();
        boolean z11 = true;
        ei.c cVar2 = new ei.c(true);
        SparseArray sparseArray2 = r6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = cVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((s6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((s6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = cVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((s6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = cVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((s6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = cVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((s6) sparseArray2.get(4)).b);
        }
        int i13 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = cVar2.j;
            if (i13 >= size3) {
                break;
            }
            hashSet.add((ei.b) arrayList3.get(i13));
            if (((ei.b) arrayList3.get(i13)).d == 0) {
                cVar2.r += ((ei.b) arrayList3.get(i13)).c;
            } else {
                cVar2.s += ((ei.b) arrayList3.get(i13)).c;
            }
            i13++;
        }
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            hashSet.add((ei.b) arrayList4.get(i14));
            cVar2.t += ((ei.b) arrayList4.get(i14)).c;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            hashSet.add((ei.b) arrayList5.get(i15));
            cVar2.u += ((ei.b) arrayList5.get(i15)).c;
        }
        int i16 = 0;
        while (i16 < arrayList6.size()) {
            hashSet.add((ei.b) arrayList6.get(i16));
            cVar2.v += ((ei.b) arrayList6.get(i16)).c;
            i16++;
            z11 = true;
        }
        cVar2.m = z11;
        cVar2.n = z11;
        cVar2.o = z11;
        cVar2.p = z11;
        cVar2.q = z11;
        Collections.sort(arrayList3, new a3.c(18));
        Collections.sort(arrayList4, new a3.c(18));
        Collections.sort(arrayList5, new a3.c(18));
        Collections.sort(arrayList6, new a3.c(18));
        Collections.sort(cVar2.h, new a3.c(18));
        au auVar = new au(x6Var, r6Var, cVar2, new k8.a(13, x6Var, r6Var));
        x6Var.a0 = auVar;
        x6Var.showDialog(auVar);
    }

    @Override // org.telegram.ui.h7
    public /* synthetic */ void dismiss() {
    }
}
