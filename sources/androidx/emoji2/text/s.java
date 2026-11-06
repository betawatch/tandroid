package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
