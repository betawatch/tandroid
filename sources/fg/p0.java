package fg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
