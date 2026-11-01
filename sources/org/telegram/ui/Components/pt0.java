package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pt0 {
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

    public final boolean a(org.telegram.messenger.kj kjVar, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.b;
        SparseArray sparseArray = sparseArrayArr[i10];
        int f12 = kjVar.f1();
        String str = kjVar.Y;
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
            arrayList.add(0, kjVar);
            arrayList3.add(0, kjVar);
        } else {
            arrayList.add(kjVar);
            arrayList3.add(kjVar);
        }
        sparseArrayArr[i10].put(kjVar.f1(), kjVar);
        int[] iArr = this.j;
        if (z11) {
            iArr[i10] = Math.max(kjVar.f1(), iArr[i10]);
            this.k = Math.min(kjVar.f1(), this.k);
        } else if (kjVar.f1() > 0) {
            iArr[i10] = Math.min(kjVar.f1(), iArr[i10]);
            this.k = Math.max(kjVar.f1(), this.k);
        }
        if (!this.v && org.telegram.messenger.kj.L4(kjVar.k)) {
            this.v = true;
        }
        if (!this.w && org.telegram.messenger.kj.S3(kjVar.k)) {
            this.w = true;
        }
        return true;
    }

    public final org.telegram.messenger.kj b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) sparseArrayArr[i11].get(i10);
        if (kjVar == null) {
            return null;
        }
        String str = kjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(kjVar);
        this.a.remove(kjVar);
        sparseArrayArr[i11].remove(kjVar.f1());
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
        return kjVar;
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
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) sparseArrayArr[i10].get(i11);
        if (kjVar != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, kjVar);
            kjVar.k.id = i12;
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
