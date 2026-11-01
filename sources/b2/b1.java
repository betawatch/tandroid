package b2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v7.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b1 {
    public static final b1 b;
    public static final String c;
    public final v a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        t6.p(!false);
        b = new b1(new v(sparseBooleanArray));
        String str = e2.l0.a;
        c = Integer.toString(0, 36);
    }

    public b1(v vVar) {
        this.a = vVar;
    }

    public final boolean a(int i10) {
        return this.a.a.get(i10);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            v vVar = this.a;
            if (i10 >= vVar.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(vVar.a(i10)));
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
