package f9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends d {
    public final /* synthetic */ int a;
    public final char b;

    public /* synthetic */ e(char c2, int i3) {
        this.a = i3;
        this.b = c2;
    }

    @Override // f9.i
    public final boolean c(char c2) {
        switch (this.a) {
            case 0:
                if (c2 == this.b) {
                }
                break;
            default:
                if (c2 != this.b) {
                }
                break;
        }
        return false;
    }

    @Override // f9.d, f9.i
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
