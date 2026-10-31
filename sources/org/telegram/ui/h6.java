package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h6 implements org.telegram.ui.Components.hu0, i7 {
    public final /* synthetic */ y6 a;

    public /* synthetic */ h6(y6 y6Var) {
        this.a = y6Var;
    }

    @Override // org.telegram.ui.Components.hu0
    public void F(boolean z10) {
        fe.b bVar = this.a.T;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.i7
    public void a(s6 s6Var, sh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = this.a;
        if (s6Var == null) {
            if (aVar != null) {
                y6Var.d0.i(aVar);
                y6Var.M.e();
                y6.h0(y6Var);
                return;
            }
            return;
        }
        if (y6Var.d0.j.size() > 0 || z10) {
            sh.b bVar = y6Var.d0;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = s6Var.a;
            SparseArray sparseArray = s6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        sh.a aVar2 = (sh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((t6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        sh.a aVar3 = (sh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            y6Var.M.e();
            y6.h0(y6Var);
            return;
        }
        if (y6Var.G <= 0 || y6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z11 = true;
        sh.b bVar2 = new sh.b(true);
        SparseArray sparseArray2 = s6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((t6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((t6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((t6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((t6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((t6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((sh.a) arrayList3.get(i14));
            if (((sh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((sh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((sh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((sh.a) arrayList4.get(i15));
            bVar2.t += ((sh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((sh.a) arrayList5.get(i16));
            bVar2.u += ((sh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((sh.a) arrayList6.get(i17));
            bVar2.v += ((sh.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        Collections.sort(arrayList3, new ex0(17));
        Collections.sort(arrayList4, new ex0(17));
        Collections.sort(arrayList5, new ex0(17));
        Collections.sort(arrayList6, new ex0(17));
        Collections.sort(bVar2.h, new ex0(17));
        zu zuVar = new zu(y6Var, s6Var, bVar2, new m4.c(13, y6Var, s6Var));
        y6Var.Z = zuVar;
        y6Var.showDialog(zuVar);
    }

    @Override // org.telegram.ui.Components.hu0
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(this.a.P), 0);
    }

    @Override // org.telegram.ui.i7
    public void clear() {
        y6.j0(this.a);
    }

    @Override // org.telegram.ui.i7
    public void d() {
        y6 y6Var = this.a;
        sh.b bVar = y6Var.d0;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        y6Var.d0.d();
        j6 j6Var = y6Var.M;
        if (j6Var != null) {
            j6Var.f(false);
            y6Var.M.e();
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public int g1() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.i7
    public /* synthetic */ void dismiss() {
    }
}
