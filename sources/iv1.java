// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class iv1 {
    public wq1 a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(r47 r47Var) {
        if (r47Var == null) {
            return false;
        }
        if (r47Var.e1() != this.b) {
            return this.c != 0 && r47Var.c1() == this.c;
        }
        return true;
    }

    public final boolean b(int i, long j) {
        if (this.b == i && this.c == j) {
            return false;
        }
        this.b = i;
        this.c = j;
        if (i != 0) {
            return true;
        }
        this.e = false;
        return true;
    }
}
