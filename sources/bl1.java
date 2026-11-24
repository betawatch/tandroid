// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bl1 extends al1 {
    public final /* synthetic */ byte a;
    public final char b;

    public /* synthetic */ bl1(char c, byte b) {
        this.a = b;
        this.b = c;
    }

    @Override // el1
    public final boolean b(char c) {
        switch (this.a) {
            case 0:
                if (c == this.b) {
                }
                break;
            default:
                if (c != this.b) {
                }
                break;
        }
        return false;
    }

    @Override // al1, el1
    public final el1 c() {
        switch (this.a) {
            case 0:
                return new bl1(this.b, (byte) 1);
            default:
                return new bl1(this.b, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.a;
        char c = this.b;
        switch (b) {
            case 0:
                return "CharMatcher.is('" + el1.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + el1.d(c) + "')";
        }
    }
}
