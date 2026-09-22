package lf;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ g(int i10, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        this.a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
