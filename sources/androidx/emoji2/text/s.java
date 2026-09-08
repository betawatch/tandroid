package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s {
    public final SparseArray a;
    public o b;

    public s(int i10) {
        this.a = new SparseArray(i10);
    }

    public final void a(o oVar, int i10, int i11) {
        int a2 = oVar.a(i10);
        SparseArray sparseArray = this.a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a2);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(oVar.a(i10), sVar);
        }
        if (i11 > i10) {
            sVar.a(oVar, i10 + 1, i11);
        } else {
            sVar.b = oVar;
        }
    }
}
