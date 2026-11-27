// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
