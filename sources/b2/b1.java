package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b1 {
    public static final b1 b;
    public static final String c;
    public final u a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6.p(!false);
        b = new b1(new u(sparseBooleanArray));
        String str = e2.m0.a;
        c = Integer.toString(0, 36);
    }

    public b1(u uVar) {
        this.a = uVar;
    }

    public final boolean a(int i10) {
        return this.a.a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            u uVar = this.a;
            if (i10 >= uVar.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(uVar.a(i10)));
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return this.a.equals(((b1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
