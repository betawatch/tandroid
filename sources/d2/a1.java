package d2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import b8.zb;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a1 {
    public static final a1 b;
    public static final String c;
    public final t a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        zb.p(!false);
        b = new a1(new t(sparseBooleanArray));
        String str = g2.n0.a;
        c = Integer.toString(0, 36);
    }

    public a1(t tVar) {
        this.a = tVar;
    }

    public final boolean a(int i3) {
        return this.a.a.get(i3);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i3 = 0;
        while (true) {
            t tVar = this.a;
            if (i3 >= tVar.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(tVar.a(i3)));
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            return this.a.equals(((a1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
