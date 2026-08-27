package ag;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class b1 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public b1(int i10, int i11, int i12, String str, String str2) {
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = str2;
        this.e = i12;
    }

    public static b1 a(int i10, int i11) {
        return new b1(i10, i11, -1, null, null);
    }

    public static b1 b(int i10, int i11, String str) {
        return new b1(i10, -1, i11, null, str);
    }
}
