package h3;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y1 implements g {
    public final d5.g a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        d5.a.i(!false);
        new d5.g(sparseBooleanArray);
        int i10 = d5.g0.a;
        Integer.toString(0, 36);
    }

    public y1(d5.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            return this.a.equals(((y1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
