// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ky0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final xu7 f;
    public final xu7 g;
    public int h;
    public int i;

    public ky0(xu7 xu7Var, xu7 xu7Var2, boolean z) {
        this.g = xu7Var;
        this.f = xu7Var2;
        this.e = z;
        xu7Var2.N(12);
        this.a = xu7Var2.E();
        xu7Var.N(12);
        this.i = xu7Var.E();
        yfe.a("first_chunk must be 1", xu7Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        xu7 xu7Var = this.f;
        this.d = z ? xu7Var.G() : xu7Var.C();
        if (this.b == this.h) {
            xu7 xu7Var2 = this.g;
            this.c = xu7Var2.E();
            xu7Var2.O(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? xu7Var2.E() - 1 : -1;
        }
        return true;
    }
}
