package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
