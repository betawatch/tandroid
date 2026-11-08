package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g6 implements org.telegram.ui.Components.et0, i7 {
    public final /* synthetic */ y6 a;

    public /* synthetic */ g6(y6 y6Var) {
        this.a = y6Var;
    }

    @Override // org.telegram.ui.Components.et0
    public void F(boolean z9) {
        te.a aVar = this.a.T;
        if (aVar == null || aVar.f == z9) {
            return;
        }
        aVar.a(z9, true);
    }

    @Override // org.telegram.ui.Components.et0
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(this.a.P), 0);
    }

    @Override // org.telegram.ui.i7
    public void clear() {
        y6.k0(this.a);
    }

    @Override // org.telegram.ui.i7
    public void d() {
        y6 y6Var = this.a;
        ci.c cVar = y6Var.d0;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        y6Var.d0.d();
        i6 i6Var = y6Var.M;
        if (i6Var != null) {
            i6Var.f(false);
            y6Var.M.e();
        }
    }

    @Override // org.telegram.ui.Components.et0
    public int e1() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.i7
    public void o(s6 s6Var, ci.b bVar, boolean z9) {
        HashSet hashSet;
        y6 y6Var = this.a;
        if (s6Var == null) {
            if (bVar != null) {
                y6Var.d0.i(bVar);
                y6Var.M.e();
                y6.i0(y6Var);
                return;
            }
            return;
        }
        if (y6Var.d0.j.size() > 0 || z9) {
            ci.c cVar = y6Var.d0;
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
                        ci.b bVar2 = (ci.b) obj;
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
                        ci.b bVar3 = (ci.b) obj2;
                        if (hashSet2.add(bVar3)) {
                            cVar.k += bVar3.c;
                        }
                    }
                }
            }
            cVar.c();
            y6Var.M.e();
            y6.i0(y6Var);
            return;
        }
        if (y6Var.G <= 0 || y6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z10 = true;
        ci.c cVar2 = new ci.c(true);
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
            hashSet.add((ci.b) arrayList3.get(i13));
            if (((ci.b) arrayList3.get(i13)).d == 0) {
                cVar2.r += ((ci.b) arrayList3.get(i13)).c;
            } else {
                cVar2.s += ((ci.b) arrayList3.get(i13)).c;
            }
            i13++;
        }
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            hashSet.add((ci.b) arrayList4.get(i14));
            cVar2.t += ((ci.b) arrayList4.get(i14)).c;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            hashSet.add((ci.b) arrayList5.get(i15));
            cVar2.u += ((ci.b) arrayList5.get(i15)).c;
        }
        int i16 = 0;
        while (i16 < arrayList6.size()) {
            hashSet.add((ci.b) arrayList6.get(i16));
            cVar2.v += ((ci.b) arrayList6.get(i16)).c;
            i16++;
            z10 = true;
        }
        cVar2.m = z10;
        cVar2.n = z10;
        cVar2.o = z10;
        cVar2.p = z10;
        cVar2.q = z10;
        Collections.sort(arrayList3, new a3.c(17));
        Collections.sort(arrayList4, new a3.c(17));
        Collections.sort(arrayList5, new a3.c(17));
        Collections.sort(arrayList6, new a3.c(17));
        Collections.sort(cVar2.h, new a3.c(17));
        wt wtVar = new wt(y6Var, s6Var, cVar2, new m4.d0(y6Var, s6Var, false));
        y6Var.Z = wtVar;
        y6Var.showDialog(wtVar);
    }

    @Override // org.telegram.ui.i7
    public /* synthetic */ void dismiss() {
    }
}
