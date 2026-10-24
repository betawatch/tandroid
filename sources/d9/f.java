package d9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
