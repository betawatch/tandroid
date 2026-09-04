package dd;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class k {
    public final /* synthetic */ int a;
    public int b;

    public static String b(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static void g(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public void a(int i10) {
        this.b = i10 | this.b;
    }

    public boolean c(int i10) {
        return (this.b & i10) == i10;
    }

    public abstract k f();

    public String toString() {
        switch (this.a) {
            case 1:
                return b(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }
}
