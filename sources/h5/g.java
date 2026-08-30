package h5;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g {
    public final SparseBooleanArray a;

    public g(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.a;
        a.h(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
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
        int i10 = d0.a;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i10 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
            if (a(i11) != gVar.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = d0.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i10 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            size = (size * 31) + a(i11);
        }
        return size;
    }
}
