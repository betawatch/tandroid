package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class x0 {
    public static final x0 b;
    public static final String c;
    public final q a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        e2.d.g(!false);
        b = new x0(new q(sparseBooleanArray));
        String str = e2.d0.a;
        c = Integer.toString(0, 36);
    }

    public x0(q qVar) {
        this.a = qVar;
    }

    public final boolean a(int i10) {
        return this.a.a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            q qVar = this.a;
            if (i10 >= qVar.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(qVar.a(i10)));
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return this.a.equals(((x0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
