// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class c46 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public c46(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    public static c46 a(int i, int i2) {
        return new c46(i, i2, -1, null, null);
    }

    public static c46 b(int i, int i2, String str) {
        return new c46(i, -1, i2, null, str);
    }
}
