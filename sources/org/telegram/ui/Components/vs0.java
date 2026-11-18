package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vs0 {
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
    public v4.w0 x = new v4.w0();

    public final boolean a(org.telegram.messenger.fj fjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.b;
        SparseArray sparseArray = sparseArrayArr[i7];
        int e12 = fjVar.e1();
        String str = fjVar.Y;
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
            arrayList.add(0, fjVar);
            arrayList3.add(0, fjVar);
        } else {
            arrayList.add(fjVar);
            arrayList3.add(fjVar);
        }
        sparseArrayArr[i7].put(fjVar.e1(), fjVar);
        int[] iArr = this.j;
        if (z11) {
            iArr[i7] = Math.max(fjVar.e1(), iArr[i7]);
            this.k = Math.min(fjVar.e1(), this.k);
        } else if (fjVar.e1() > 0) {
            iArr[i7] = Math.min(fjVar.e1(), iArr[i7]);
            this.k = Math.max(fjVar.e1(), this.k);
        }
        if (!this.v && org.telegram.messenger.fj.L4(fjVar.k)) {
            this.v = true;
        }
        if (!this.w && org.telegram.messenger.fj.S3(fjVar.k)) {
            this.w = true;
        }
        return true;
    }

    public final org.telegram.messenger.fj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.b;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i10].get(i7);
        if (fjVar == null) {
            return null;
        }
        String str = fjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(fjVar);
        this.a.remove(fjVar);
        sparseArrayArr[i10].remove(fjVar.e1());
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
        return fjVar;
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
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].get(i10);
        if (fjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, fjVar);
            fjVar.k.id = i11;
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
