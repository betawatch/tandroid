// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ck1 extends bk1 {
    public final /* synthetic */ byte a;
    public final char b;

    public /* synthetic */ ck1(char c, byte b) {
        this.a = b;
        this.b = c;
    }

    @Override // fk1
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

    @Override // bk1, fk1
    public final fk1 c() {
        switch (this.a) {
            case 0:
                return new ck1(this.b, (byte) 1);
            default:
                return new ck1(this.b, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.a;
        char c = this.b;
        switch (b) {
            case 0:
                return "CharMatcher.is('" + fk1.d(c) + "')";
            default:
                return "CharMatcher.isNot('" + fk1.d(c) + "')";
        }
    }
}
