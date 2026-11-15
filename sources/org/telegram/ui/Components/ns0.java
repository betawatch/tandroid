package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ns0 {
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
    public v4.v0 x = new v4.v0();

    public final boolean a(org.telegram.messenger.gj gjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.b;
        SparseArray sparseArray = sparseArrayArr[i7];
        int e12 = gjVar.e1();
        String str = gjVar.Y;
        if (sparseArray.indexOfKey(e12) >= 0) {
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
            arrayList.add(0, gjVar);
            arrayList3.add(0, gjVar);
        } else {
            arrayList.add(gjVar);
            arrayList3.add(gjVar);
        }
        sparseArrayArr[i7].put(gjVar.e1(), gjVar);
        int[] iArr = this.j;
        if (z11) {
            iArr[i7] = Math.max(gjVar.e1(), iArr[i7]);
            this.k = Math.min(gjVar.e1(), this.k);
        } else if (gjVar.e1() > 0) {
            iArr[i7] = Math.min(gjVar.e1(), iArr[i7]);
            this.k = Math.max(gjVar.e1(), this.k);
        }
        if (!this.v && org.telegram.messenger.gj.L4(gjVar.k)) {
            this.v = true;
        }
        if (!this.w && org.telegram.messenger.gj.S3(gjVar.k)) {
            this.w = true;
        }
        return true;
    }

    public final org.telegram.messenger.gj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i10].get(i7);
        if (gjVar == null) {
            return null;
        }
        String str = gjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(gjVar);
        this.a.remove(gjVar);
        sparseArrayArr[i10].remove(gjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.c.remove(str);
        }
        int[] iArr = this.f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return gjVar;
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

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(i10);
        if (gjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, gjVar);
            gjVar.k.id = i11;
            int[] iArr = this.j;
            iArr[i7] = Math.min(i11, iArr[i7]);
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
