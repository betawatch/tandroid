package d9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e extends d {
    public final /* synthetic */ int a;
    public final char b;

    public /* synthetic */ e(char c10, int i10) {
        this.a = i10;
        this.b = c10;
    }

    @Override // d9.i
    public final boolean c(char c10) {
        switch (this.a) {
            case 0:
                if (c10 == this.b) {
                }
                break;
            default:
                if (c10 != this.b) {
                }
                break;
        }
        return false;
    }

    @Override // d9.d, d9.i
    public final i d() {
        switch (this.a) {
            case 0:
                return new e(this.b, 1);
            default:
                return new e(this.b, 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CharMatcher.is('" + i.a(this.b) + "')";
            default:
                return "CharMatcher.isNot('" + i.a(this.b) + "')";
        }
    }
}
