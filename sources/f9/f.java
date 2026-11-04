package f9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends d {
    public final char a;
    public final char b;

    public f(char c2, char c10) {
        this.a = c2;
        this.b = c10;
    }

    @Override // f9.i
    public final boolean c(char c2) {
        return c2 == this.a || c2 == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + i.a(this.a) + i.a(this.b) + "\")";
    }
}
