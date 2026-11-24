// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class b26 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public b26(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    public static b26 a(int i, int i2) {
        return new b26(i, i2, -1, null, null);
    }

    public static b26 b(int i, int i2, String str) {
        return new b26(i, -1, i2, null, str);
    }
}
