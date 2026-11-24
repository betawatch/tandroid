// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kc8 {
    public static final kc8 b = new jc8().b();
    public static final String c;
    public final gi4 a;

    static {
        String str = g8c.a;
        c = "0";
    }

    public kc8(gi4 gi4Var) {
        this.a = gi4Var;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            gi4 gi4Var = this.a;
            if (i >= gi4Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(gi4Var.a(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kc8) {
            return this.a.equals(((kc8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
