package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class s {
    public final SparseArray a;
    public o b;

    public s(int i7) {
        this.a = new SparseArray(i7);
    }

    public final void a(o oVar, int i7, int i10) {
        int a10 = oVar.a(i7);
        SparseArray sparseArray = this.a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a10);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(oVar.a(i7), sVar);
        }
        if (i10 > i7) {
            sVar.a(oVar, i7 + 1, i10);
        } else {
            sVar.b = oVar;
        }
    }
}
