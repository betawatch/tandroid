package e2;

import a8.ia;
import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s {
    public final SparseBooleanArray a;

    public s(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.a;
        ia.j(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        SparseBooleanArray sparseBooleanArray = sVar.a;
        int i7 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i7 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
            if (a(i10) != sVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i7 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
