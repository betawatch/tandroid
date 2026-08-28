package d5;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public final SparseBooleanArray a;

    public g(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i9) {
        SparseBooleanArray sparseBooleanArray = this.a;
        a.h(i9, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.a;
        int i9 = f0.a;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i9 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
            if (a(i10) != gVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i9 = f0.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i9 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
