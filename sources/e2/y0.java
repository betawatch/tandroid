package e2;

import a8.ia;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class y0 {
    public static final y0 b;
    public static final String c;
    public final s a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        ia.p(!false);
        b = new y0(new s(sparseBooleanArray));
        String str = h2.m0.a;
        c = Integer.toString(0, 36);
    }

    public y0(s sVar) {
        this.a = sVar;
    }

    public final boolean a(int i7) {
        return this.a.a.get(i7);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            s sVar = this.a;
            if (i7 >= sVar.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(sVar.a(i7)));
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return this.a.equals(((y0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
