package eg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class p0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public p0(int i10, int i11, int i12, String str, String str2) {
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = str2;
        this.e = i12;
    }

    public static p0 a(int i10, int i11) {
        return new p0(i10, i11, -1, null, null);
    }

    public static p0 b(int i10, int i11, String str) {
        return new p0(i10, -1, i11, null, str);
    }
}
