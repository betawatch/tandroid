// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ka4 {
    public long a;
    public int b;
    public final long c;
    public final long d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final ja4 j;

    public ka4(long j, int i, long j2, float f, float f2, float f3, float f4, ja4 ja4Var) {
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = ja4Var;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(":");
        long j = this.d;
        sb.append(j != 0 ? kt6.n(j, "g") : Integer.valueOf(this.e));
        return sb.toString();
    }
}
