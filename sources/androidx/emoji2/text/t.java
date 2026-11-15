package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t {
    public final SparseArray a;
    public p b;

    public t(int i7) {
        this.a = new SparseArray(i7);
    }

    public final void a(p pVar, int i7, int i10) {
        int a10 = pVar.a(i7);
        SparseArray sparseArray = this.a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a10);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(pVar.a(i7), tVar);
        }
        if (i10 > i7) {
            tVar.a(pVar, i7 + 1, i10);
        } else {
            tVar.b = pVar;
        }
    }
}
