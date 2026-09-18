package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
