package f2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class f {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ f(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static void c(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract f b();

    public String toString() {
        switch (this.a) {
            case 0:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
