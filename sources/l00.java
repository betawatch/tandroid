// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l00 {
    public static final l00 d = new k00().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public l00(k00 k00Var) {
        this.a = k00Var.a;
        this.b = k00Var.b;
        this.c = k00Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l00.class != obj.getClass()) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return this.a == l00Var.a && this.b == l00Var.b && this.c == l00Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
