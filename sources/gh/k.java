package gh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k {
    public int a;
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

    public static long b(int i3, long j10) {
        return (j10 ^ i3) * 1099511628211L;
    }

    public final long a() {
        long b10 = b(this.a, -3750763034362895579L);
        for (int i3 : this.b) {
            b10 = b(i3, b10);
        }
        return b(this.q, b(this.p, b(this.o, b(this.n, b(this.m, b(this.l, b(this.k ? -1 : this.i, b(this.j ? -1 : this.h, b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.c), b10))))))))));
    }
}
