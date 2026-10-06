package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
