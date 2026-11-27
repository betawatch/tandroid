// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ek2 {
    public final String a;
    public final String b;

    public ek2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ek2)) {
            return false;
        }
        ek2 ek2Var = (ek2) obj;
        return this.a.equals(ek2Var.a) && this.b.equals(ek2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
