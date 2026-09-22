package c5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public /* synthetic */ a() {
        this.a = 1;
    }

    public q a() {
        if ("first_party".equals(this.c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.c != null) {
            return new q(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i10, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
    }

    public a(String str, String str2) {
        this.a = 4;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
