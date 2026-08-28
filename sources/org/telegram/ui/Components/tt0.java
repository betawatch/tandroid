package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tt0 {
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
    public f2.f1 x = new f2.f1();

    public final boolean a(MessageObject messageObject, int i9, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.b;
        if (sparseArrayArr[i9].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i9].put(messageObject.getId(), messageObject);
        int[] iArr = this.j;
        if (z11) {
            iArr[i9] = Math.max(messageObject.getId(), iArr[i9]);
            this.k = Math.min(messageObject.getId(), this.k);
        } else if (messageObject.getId() > 0) {
            iArr[i9] = Math.min(messageObject.getId(), iArr[i9]);
            this.k = Math.max(messageObject.getId(), this.k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.w && messageObject.isPhoto()) {
            this.w = true;
        }
        return true;
    }

    public final MessageObject b(int i9, int i10) {
        SparseArray[] sparseArrayArr = this.b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i9);
        if (messageObject == null) {
            return null;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(messageObject);
        this.a.remove(messageObject);
        sparseArrayArr[i10].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return messageObject;
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

    public final void f(int i9, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i9].get(i10);
        if (messageObject != null) {
            sparseArrayArr[i9].remove(i10);
            sparseArrayArr[i9].put(i11, messageObject);
            messageObject.messageOwner.id = i11;
            int[] iArr = this.j;
            iArr[i9] = Math.min(i11, iArr[i9]);
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
