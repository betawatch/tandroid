package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
