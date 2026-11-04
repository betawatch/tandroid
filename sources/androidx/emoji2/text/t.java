package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public final SparseArray a;
    public p b;

    public t(int i3) {
        this.a = new SparseArray(i3);
    }

    public final void a(p pVar, int i3, int i10) {
        int a10 = pVar.a(i3);
        SparseArray sparseArray = this.a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a10);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(pVar.a(i3), tVar);
        }
        if (i10 > i3) {
            tVar.a(pVar, i3 + 1, i10);
        } else {
            tVar.b = pVar;
        }
    }
}
