package j3;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y1 implements g {
    public final f5.g a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        f5.a.i(!false);
        new f5.g(sparseBooleanArray);
        int i10 = f5.d0.a;
        Integer.toString(0, 36);
    }

    public y1(f5.g gVar) {
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
