package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class r {
    public final SparseArray a;
    public n b;

    public r(int i10) {
        this.a = new SparseArray(i10);
    }

    public final void a(n nVar, int i10, int i11) {
        int a2 = nVar.a(i10);
        SparseArray sparseArray = this.a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a2);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i10), rVar);
        }
        if (i11 > i10) {
            rVar.a(nVar, i10 + 1, i11);
        } else {
            rVar.b = nVar;
        }
    }
}
