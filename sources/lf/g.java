package lf;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
