package kg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class l0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public l0(int i10, int i11, int i12, String str, String str2) {
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = str2;
        this.e = i12;
    }

    public static l0 a(int i10, int i11) {
        return new l0(i10, i11, -1, null, null);
    }

    public static l0 b(int i10, int i11, String str) {
        return new l0(i10, -1, i11, null, str);
    }
}
