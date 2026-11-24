// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ne8 {
    public static final ne8 b = new me8().b();
    public static final String c;
    public final lk4 a;

    static {
        String str = hac.a;
        c = "0";
    }

    public ne8(lk4 lk4Var) {
        this.a = lk4Var;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            lk4 lk4Var = this.a;
            if (i >= lk4Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(lk4Var.a(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ne8) {
            return this.a.equals(((ne8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
