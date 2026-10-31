package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ot0 {
    public boolean g;
    public boolean h;
    public int k;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean r;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public final ArrayList a = new ArrayList();
    public final SparseArray[] b = {new SparseArray(), new SparseArray()};
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f = {0, 0};
    public final boolean[] i = {false, true};
    public final int[] j = {0, 0};
    public boolean l = true;
    public int q = 0;
    public final ArrayList s = new ArrayList();
    public s4.u0 x = new s4.u0();

    public final boolean a(org.telegram.messenger.jj jjVar, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.b;
        SparseArray sparseArray = sparseArrayArr[i10];
        int f12 = jjVar.f1();
        String str = jjVar.Y;
        if (sparseArray.indexOfKey(f12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.a;
        if (z10) {
            arrayList.add(0, jjVar);
            arrayList3.add(0, jjVar);
        } else {
            arrayList.add(jjVar);
            arrayList3.add(jjVar);
        }
        sparseArrayArr[i10].put(jjVar.f1(), jjVar);
        int[] iArr = this.j;
        if (z11) {
            iArr[i10] = Math.max(jjVar.f1(), iArr[i10]);
            this.k = Math.min(jjVar.f1(), this.k);
        } else if (jjVar.f1() > 0) {
            iArr[i10] = Math.min(jjVar.f1(), iArr[i10]);
            this.k = Math.max(jjVar.f1(), this.k);
        }
        if (!this.v && org.telegram.messenger.jj.L4(jjVar.k)) {
            this.v = true;
        }
        if (!this.w && org.telegram.messenger.jj.S3(jjVar.k)) {
            this.w = true;
        }
        return true;
    }

    public final org.telegram.messenger.jj b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i11].get(i10);
        if (jjVar == null) {
            return null;
        }
        String str = jjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(jjVar);
        this.a.remove(jjVar);
        sparseArrayArr[i11].remove(jjVar.f1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.c.remove(str);
        }
        int[] iArr = this.f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return jjVar;
    }

    public final ArrayList c() {
        return this.r ? this.s : this.a;
    }

    public final int d() {
        return this.r ? this.t : this.m;
    }

    public final int e() {
        int[] iArr = this.f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i10].get(i11);
        if (jjVar != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, jjVar);
            jjVar.k.id = i12;
            int[] iArr = this.j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        if (z10) {
            this.t = this.m;
            this.u = this.n;
            ArrayList arrayList = this.s;
            arrayList.clear();
            arrayList.addAll(this.a);
        }
    }
}
