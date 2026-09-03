package j3;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class w1 implements g {
    public final h5.g a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        h5.a.i(!false);
        new h5.g(sparseBooleanArray);
        int i10 = h5.d0.a;
        Integer.toString(0, 36);
    }

    public w1(h5.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w1) {
            return this.a.equals(((w1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
