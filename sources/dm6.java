// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dm6 extends ni2 {
    public final long s;

    public dm6(a83 a83Var, g83 g83Var, go4 go4Var, int i, Object obj, long j, long j2, long j3, String str) {
        super(a83Var, g83Var, 1, go4Var, i, obj, j, j2, str);
        go4Var.getClass();
        this.s = j3;
    }

    public long b() {
        long j = this.s;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public boolean c() {
        throw null;
    }
}
