package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ k(int i9, int i10) {
        this.a = i10;
        this.b = i9;
    }

    public static String a(int i9) {
        return "" + ((char) ((i9 >> 24) & 255)) + ((char) ((i9 >> 16) & 255)) + ((char) ((i9 >> 8) & 255)) + ((char) (i9 & 255));
    }

    public static int b(int i9) {
        return (i9 >> 24) & 255;
    }

    public static void d(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract k c();

    public String toString() {
        switch (this.a) {
            case 1:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
