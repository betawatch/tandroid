package g9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f extends d {
    public final char a;
    public final char b;

    public f(char c10, char c11) {
        this.a = c10;
        this.b = c11;
    }

    @Override // g9.i
    public final boolean c(char c10) {
        return c10 == this.a || c10 == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.a) + i.a(this.b) + "\")";
    }
}
