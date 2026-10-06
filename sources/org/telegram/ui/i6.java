package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class i6 implements org.telegram.ui.Components.yv0, k7 {
    public final /* synthetic */ a7 a;

    public /* synthetic */ i6(a7 a7Var) {
        this.a = a7Var;
    }

    @Override // org.telegram.ui.Components.yv0
    public void E(boolean z10) {
        le.b bVar = this.a.T;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.yv0
    public float Y0() {
        return org.telegram.messenger.q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + this.a.P, 0);
    }

    @Override // org.telegram.ui.k7
    public void clear() {
        this.a.j0();
    }

    @Override // org.telegram.ui.Components.yv0
    public int e1() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.k7
    public void f(u6 u6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        a7 a7Var = this.a;
        if (u6Var == null) {
            if (aVar != null) {
                a7Var.e0.i(aVar);
                a7Var.M.e();
                a7.d0(a7Var);
                return;
            }
            return;
        }
        if (a7Var.e0.j.size() > 0 || z10) {
            zh.b bVar = a7Var.e0;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j3 = u6Var.a;
            SparseArray sparseArray = u6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        zh.a aVar2 = (zh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((v6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        zh.a aVar3 = (zh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            a7Var.M.e();
            a7.d0(a7Var);
            return;
        }
        if (a7Var.G <= 0 || a7Var.getParentActivity() == null) {
            return;
        }
        u6Var.getClass();
        boolean z11 = true;
        zh.b bVar2 = new zh.b(true);
        SparseArray sparseArray2 = u6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((v6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((v6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((v6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((v6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((v6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((zh.a) arrayList3.get(i14));
            if (((zh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((zh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((zh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((zh.a) arrayList4.get(i15));
            bVar2.t += ((zh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((zh.a) arrayList5.get(i16));
            bVar2.u += ((zh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((zh.a) arrayList6.get(i17));
            bVar2.v += ((zh.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        Collections.sort(arrayList3, new eb1(25));
        Collections.sort(arrayList4, new eb1(25));
        Collections.sort(arrayList5, new eb1(25));
        Collections.sort(arrayList6, new eb1(25));
        Collections.sort(bVar2.h, new eb1(25));
        jv jvVar = new jv(a7Var, u6Var, bVar2, new o0.a(a7Var, u6Var, false, 2));
        a7Var.Z = jvVar;
        a7Var.showDialog(jvVar);
    }

    @Override // org.telegram.ui.k7
    public void i() {
        a7 a7Var = this.a;
        zh.b bVar = a7Var.e0;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        a7Var.e0.d();
        k6 k6Var = a7Var.M;
        if (k6Var != null) {
            k6Var.f(false);
            a7Var.M.e();
        }
    }

    @Override // org.telegram.ui.k7
    public /* synthetic */ void dismiss() {
    }
}
