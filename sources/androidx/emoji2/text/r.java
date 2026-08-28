package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r {
    public final SparseArray a;
    public n b;

    public r(int i9) {
        this.a = new SparseArray(i9);
    }

    public final void a(n nVar, int i9, int i10) {
        int a2 = nVar.a(i9);
        SparseArray sparseArray = this.a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a2);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i9), rVar);
        }
        if (i10 > i9) {
            rVar.a(nVar, i9 + 1, i10);
        } else {
            rVar.b = nVar;
        }
    }
}
