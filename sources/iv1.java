// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
