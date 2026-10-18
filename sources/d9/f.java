package d9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class f extends d {
    public final char a;
    public final char b;

    public f(char c10, char c11) {
        this.a = c10;
        this.b = c11;
    }

    @Override // d9.i
    public final boolean c(char c10) {
        return c10 == this.a || c10 == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.a) + i.a(this.b) + "\")";
    }
}
