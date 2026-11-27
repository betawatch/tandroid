// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
