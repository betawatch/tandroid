package g9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
