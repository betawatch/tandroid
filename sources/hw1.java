// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hw1 {
    public vr1 a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(k47 k47Var) {
        if (k47Var == null) {
            return false;
        }
        if (k47Var.e1() != this.b) {
            return this.c != 0 && k47Var.c1() == this.c;
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
