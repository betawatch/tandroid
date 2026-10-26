package b2;

import a8.yb;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c1 {
    public static final c1 b;
    public static final String c;
    public final v a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        yb.p(!false);
        b = new c1(new v(sparseBooleanArray));
        String str = e2.n0.a;
        c = Integer.toString(0, 36);
    }

    public c1(v vVar) {
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
        if (obj instanceof c1) {
            return this.a.equals(((c1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
