package b2;

import a8.yb;
import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v {
    public final SparseBooleanArray a;

    public v(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.a;
        yb.j(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        SparseBooleanArray sparseBooleanArray = vVar.a;
        int i10 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i10 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
            if (a(i11) != vVar.a(i11)) {
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
