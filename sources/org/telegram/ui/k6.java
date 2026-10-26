package org.telegram.ui;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k6 implements org.telegram.ui.Components.iw0, m7 {
    public final /* synthetic */ c7 a;

    public /* synthetic */ k6(c7 c7Var) {
        this.a = c7Var;
    }

    @Override // org.telegram.ui.Components.iw0
    public void B(boolean z10) {
        oe.b bVar = this.a.T;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.iw0
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + this.a.P, 0);
    }

    @Override // org.telegram.ui.Components.iw0
    public int b1() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.m7
    public void clear() {
        c7.g0(this.a);
    }

    @Override // org.telegram.ui.m7
    public void p() {
        c7 c7Var = this.a;
        ci.b bVar = c7Var.e0;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        c7Var.e0.d();
        m6 m6Var = c7Var.M;
        if (m6Var != null) {
            m6Var.f(false);
            c7Var.M.e();
        }
    }

    @Override // org.telegram.ui.m7
    public void q(w6 w6Var, ci.a aVar, boolean z10) {
        HashSet hashSet;
        c7 c7Var = this.a;
        if (w6Var == null) {
            if (aVar != null) {
                c7Var.e0.i(aVar);
                c7Var.M.e();
                c7.e0(c7Var);
                return;
            }
            return;
        }
        if (c7Var.e0.j.size() > 0 || z10) {
            ci.b bVar = c7Var.e0;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = w6Var.a;
            SparseArray sparseArray = w6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((x6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ci.a aVar2 = (ci.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((x6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ci.a aVar3 = (ci.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            c7Var.M.e();
            c7.e0(c7Var);
            return;
        }
        if (c7Var.G <= 0 || c7Var.getParentActivity() == null) {
            return;
        }
        w6Var.getClass();
        boolean z11 = true;
        ci.b bVar2 = new ci.b(true);
        SparseArray sparseArray2 = w6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((x6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((x6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((x6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((x6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((x6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((ci.a) arrayList3.get(i14));
            if (((ci.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((ci.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((ci.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((ci.a) arrayList4.get(i15));
            bVar2.t += ((ci.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((ci.a) arrayList5.get(i16));
            bVar2.u += ((ci.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((ci.a) arrayList6.get(i17));
            bVar2.v += ((ci.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        Collections.sort(arrayList3, new a4.d(6));
        Collections.sort(arrayList4, new a4.d(6));
        Collections.sort(arrayList5, new a4.d(6));
        Collections.sort(arrayList6, new a4.d(6));
        Collections.sort(bVar2.h, new a4.d(6));
        vu vuVar = new vu(c7Var, w6Var, bVar2, new m4.c(c7Var, w6Var, false, 8));
        c7Var.Z = vuVar;
        c7Var.showDialog(vuVar);
    }

    @Override // org.telegram.ui.m7
    public /* synthetic */ void dismiss() {
    }
}
