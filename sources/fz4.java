// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fz4 {
    public byte a;
    public final int[] b = new int[8];
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    public static long b(int i, long j) {
        return (j ^ i) * 1099511628211L;
    }

    public final long a() {
        long b = b(this.a, -3750763034362895579L);
        for (int i : this.b) {
            b = b(i, b);
        }
        return b(this.q, b(this.p, b(this.o, b(this.n, b(this.m, b(this.l, b(this.k ? -1 : this.i, b(this.j ? -1 : this.h, b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.c), b))))))))));
    }
}
