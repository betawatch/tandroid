package g9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class e extends d {
    public final /* synthetic */ int a;
    public final char b;

    public /* synthetic */ e(char c10, int i7) {
        this.a = i7;
        this.b = c10;
    }

    @Override // g9.i
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

    @Override // g9.d, g9.i
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
