package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h6 implements org.telegram.ui.Components.pt0, i7 {
    public final /* synthetic */ y6 a;

    public /* synthetic */ h6(y6 y6Var) {
        this.a = y6Var;
    }

    @Override // org.telegram.ui.i7
    public void B() {
        y6 y6Var = this.a;
        ei.c cVar = y6Var.e0;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        y6Var.e0.d();
        j6 j6Var = y6Var.N;
        if (j6Var != null) {
            j6Var.f(false);
            y6Var.N.e();
        }
    }

    @Override // org.telegram.ui.Components.pt0
    public void E(boolean z10) {
        te.a aVar = this.a.U;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.pt0
    public float K0() {
        return i5.c.d(9.66f, ri.a.d(this.a.Q), 0);
    }

    @Override // org.telegram.ui.i7
    public void O(s6 s6Var, ei.b bVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = this.a;
        if (s6Var == null) {
            if (bVar != null) {
                y6Var.e0.i(bVar);
                y6Var.N.e();
                y6.i0(y6Var);
                return;
            }
            return;
        }
        if (y6Var.e0.j.size() > 0 || z10) {
            ei.c cVar = y6Var.e0;
            HashSet hashSet2 = cVar.j;
            HashSet hashSet3 = cVar.l;
            long j3 = s6Var.a;
            SparseArray sparseArray = s6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i7)).b;
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
                    ArrayList arrayList2 = ((t6) sparseArray.valueAt(i11)).b;
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
            y6Var.N.e();
            y6.i0(y6Var);
            return;
        }
        if (y6Var.H <= 0 || y6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z11 = true;
        ei.c cVar2 = new ei.c(true);
        SparseArray sparseArray2 = s6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = cVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((t6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((t6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = cVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((t6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = cVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((t6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = cVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((t6) sparseArray2.get(4)).b);
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
        zt ztVar = new zt(y6Var, s6Var, cVar2, new jb.m(y6Var, s6Var, false, 14));
        y6Var.a0 = ztVar;
        y6Var.showDialog(ztVar);
    }

    @Override // org.telegram.ui.Components.pt0
    public int T0() {
        return this.a.R;
    }

    @Override // org.telegram.ui.i7
    public void clear() {
        y6.k0(this.a);
    }

    @Override // org.telegram.ui.i7
    public /* synthetic */ void dismiss() {
    }
}
