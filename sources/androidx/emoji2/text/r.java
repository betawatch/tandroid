package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r {
    public final SparseArray a;
    public o b;

    public r(int i10) {
        this.a = new SparseArray(i10);
    }

    public final void a(o oVar, int i10, int i11) {
        int a2 = oVar.a(i10);
        SparseArray sparseArray = this.a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a2);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(oVar.a(i10), rVar);
        }
        if (i11 > i10) {
            rVar.a(oVar, i10 + 1, i11);
        } else {
            rVar.b = oVar;
        }
    }
}
