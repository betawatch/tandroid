package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
