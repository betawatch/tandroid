package h3;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y1 implements g {
    public final d5.g a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        d5.a.i(!false);
        new d5.g(sparseBooleanArray);
        int i9 = d5.f0.a;
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
