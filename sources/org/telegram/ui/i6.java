package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i6 implements org.telegram.ui.Components.dt0, j7 {
    public final /* synthetic */ z6 a;

    public /* synthetic */ i6(z6 z6Var) {
        this.a = z6Var;
    }

    @Override // org.telegram.ui.Components.dt0
    public void F(boolean z10) {
        qe.a aVar = this.a.U;
        if (aVar == null || aVar.f == z10) {
            return;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.j7
    public void a(t6 t6Var, di.b bVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = this.a;
        if (t6Var == null) {
            if (bVar != null) {
                z6Var.e0.i(bVar);
                z6Var.N.e();
                z6.i0(z6Var);
                return;
            }
            return;
        }
        if (z6Var.e0.j.size() > 0 || z10) {
            di.c cVar = z6Var.e0;
            HashSet hashSet2 = cVar.j;
            HashSet hashSet3 = cVar.l;
            long j10 = t6Var.a;
            SparseArray sparseArray = t6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    ArrayList arrayList = ((u6) sparseArray.valueAt(i3)).b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        di.b bVar2 = (di.b) obj;
                        if (hashSet2.remove(bVar2)) {
                            cVar.k -= bVar2.c;
                        }
                    }
                }
            } else {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    ArrayList arrayList2 = ((u6) sparseArray.valueAt(i11)).b;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        di.b bVar3 = (di.b) obj2;
                        if (hashSet2.add(bVar3)) {
                            cVar.k += bVar3.c;
                        }
                    }
                }
            }
            cVar.c();
            z6Var.N.e();
            z6.i0(z6Var);
            return;
        }
        if (z6Var.H <= 0 || z6Var.getParentActivity() == null) {
            return;
        }
        t6Var.getClass();
        boolean z11 = true;
        di.c cVar2 = new di.c(true);
        SparseArray sparseArray2 = t6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = cVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((u6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((u6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = cVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((u6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = cVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((u6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = cVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((u6) sparseArray2.get(4)).b);
        }
        int i13 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = cVar2.j;
            if (i13 >= size3) {
                break;
            }
            hashSet.add((di.b) arrayList3.get(i13));
            if (((di.b) arrayList3.get(i13)).d == 0) {
                cVar2.r += ((di.b) arrayList3.get(i13)).c;
            } else {
                cVar2.s += ((di.b) arrayList3.get(i13)).c;
            }
            i13++;
        }
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            hashSet.add((di.b) arrayList4.get(i14));
            cVar2.t += ((di.b) arrayList4.get(i14)).c;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            hashSet.add((di.b) arrayList5.get(i15));
            cVar2.u += ((di.b) arrayList5.get(i15)).c;
        }
        int i16 = 0;
        while (i16 < arrayList6.size()) {
            hashSet.add((di.b) arrayList6.get(i16));
            cVar2.v += ((di.b) arrayList6.get(i16)).c;
            i16++;
            z11 = true;
        }
        cVar2.m = z11;
        cVar2.n = z11;
        cVar2.o = z11;
        cVar2.p = z11;
        cVar2.q = z11;
        Collections.sort(arrayList3, new a3.u(8));
        Collections.sort(arrayList4, new a3.u(8));
        Collections.sort(arrayList5, new a3.u(8));
        Collections.sort(arrayList6, new a3.u(8));
        Collections.sort(cVar2.h, new a3.u(8));
        ut utVar = new ut(z6Var, t6Var, cVar2, new m2.t(10, z6Var, t6Var));
        z6Var.a0 = utVar;
        z6Var.showDialog(utVar);
    }

    @Override // org.telegram.ui.j7
    public void clear() {
        z6.k0(this.a);
    }

    @Override // org.telegram.ui.j7
    public void d() {
        z6 z6Var = this.a;
        di.c cVar = z6Var.e0;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        z6Var.e0.d();
        k6 k6Var = z6Var.N;
        if (k6Var != null) {
            k6Var.f(false);
            z6Var.N.e();
        }
    }

    @Override // org.telegram.ui.Components.dt0
    public float h1() {
        return k2.p1.d(9.66f, pi.a.d(this.a.Q), 0);
    }

    @Override // org.telegram.ui.Components.dt0
    public int m1() {
        return this.a.R;
    }

    @Override // org.telegram.ui.j7
    public /* synthetic */ void dismiss() {
    }
}
