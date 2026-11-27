// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dk1 extends bk1 {
    public final char a;
    public final char b;

    public dk1(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // fk1
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + fk1.d(this.a) + fk1.d(this.b) + "\")";
    }
}
