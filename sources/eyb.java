// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eyb {
    public static final eyb b;
    public static final String c;
    public final mm5 a;

    static {
        km5 km5Var = mm5.b;
        b = new eyb(w59.e);
        String str = g8c.a;
        c = "0";
    }

    public eyb(w59 w59Var) {
        this.a = mm5.q(w59Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            mm5 mm5Var = this.a;
            if (i2 >= mm5Var.size()) {
                return false;
            }
            dyb dybVar = (dyb) mm5Var.get(i2);
            boolean[] zArr = dybVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (dybVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eyb.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((eyb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
