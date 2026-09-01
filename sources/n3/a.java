package n3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public static void h(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public void a(int i10) {
        this.b = i10 | this.b;
    }

    public abstract void b();

    public boolean e(int i10) {
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
