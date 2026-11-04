package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ls0 {
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
    public u4.v0 x = new u4.v0();

    public final boolean a(org.telegram.messenger.zi ziVar, int i3, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.b;
        SparseArray sparseArray = sparseArrayArr[i3];
        int f12 = ziVar.f1();
        String str = ziVar.Y;
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
            arrayList.add(0, ziVar);
            arrayList3.add(0, ziVar);
        } else {
            arrayList.add(ziVar);
            arrayList3.add(ziVar);
        }
        sparseArrayArr[i3].put(ziVar.f1(), ziVar);
        int[] iArr = this.j;
        if (z11) {
            iArr[i3] = Math.max(ziVar.f1(), iArr[i3]);
            this.k = Math.min(ziVar.f1(), this.k);
        } else if (ziVar.f1() > 0) {
            iArr[i3] = Math.min(ziVar.f1(), iArr[i3]);
            this.k = Math.max(ziVar.f1(), this.k);
        }
        if (!this.v && org.telegram.messenger.zi.M4(ziVar.k)) {
            this.v = true;
        }
        if (!this.w && org.telegram.messenger.zi.T3(ziVar.k)) {
            this.w = true;
        }
        return true;
    }

    public final org.telegram.messenger.zi b(int i3, int i10) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i10].get(i3);
        if (ziVar == null) {
            return null;
        }
        String str = ziVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(ziVar);
        this.a.remove(ziVar);
        sparseArrayArr[i10].remove(ziVar.f1());
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
        return ziVar;
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

    public final void f(int i3, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i3].get(i10);
        if (ziVar != null) {
            sparseArrayArr[i3].remove(i10);
            sparseArrayArr[i3].put(i11, ziVar);
            ziVar.k.id = i11;
            int[] iArr = this.j;
            iArr[i3] = Math.min(i11, iArr[i3]);
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
