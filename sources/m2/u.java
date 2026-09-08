package m2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ u(int i10, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public u(String str, String str2) {
        this.a = 2;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
