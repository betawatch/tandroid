// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
