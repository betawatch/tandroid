// default package

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ir2 {
    public static final SparseArray e = new SparseArray();
    public static final ArrayList f = new ArrayList();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public ir2(int i, int i2) {
        if (i == -2) {
            this.d = true;
            i = -1;
        }
        this.a = i;
        Integer valueOf = Integer.valueOf(i);
        this.b = i2;
        this.c = Objects.hash(0, valueOf, Integer.valueOf(i2));
    }

    public final void a() {
        if (e.indexOfKey(this.c) >= 0) {
            return;
        }
        ArrayList arrayList = f;
        if (arrayList.contains(Integer.valueOf(this.c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.c));
        Utilities.e.c(new vd2(this, (byte) 14));
    }

    public final int hashCode() {
        return this.c;
    }
}
