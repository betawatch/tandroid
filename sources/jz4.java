// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jz4 {
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
