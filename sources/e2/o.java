package e2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o {
    public static final o c = new o(new t1());
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = h2.l0.a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public o(t1 t1Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
