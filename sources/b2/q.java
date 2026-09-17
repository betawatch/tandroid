package b2;

import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class q {
    public final SparseBooleanArray a;

    public q(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.a;
        e2.d.c(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        SparseBooleanArray sparseBooleanArray = qVar.a;
        int i10 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i10 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
            if (a(i11) != qVar.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = Build.VERSION.SDK_INT;
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
