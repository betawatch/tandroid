package n3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a {
    public final /* synthetic */ int a;
    public int b;

    public static String c(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int f(int i10) {
        return (i10 >> 24) & 255;
    }

    public static void i(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public void a(int i10) {
        this.b = i10 | this.b;
    }

    public abstract void b();

    public boolean d(int i10) {
        return (this.b & i10) == i10;
    }

    public abstract a g();

    public String toString() {
        switch (this.a) {
            case 2:
                return c(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }
}
