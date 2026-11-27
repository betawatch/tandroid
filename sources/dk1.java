// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
