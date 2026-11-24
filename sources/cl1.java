// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cl1 extends al1 {
    public final char a;
    public final char b;

    public cl1(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // el1
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + el1.d(this.a) + el1.d(this.b) + "\")";
    }
}
