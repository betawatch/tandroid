// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ga4 {
    public long a;
    public int b;
    public final long c;
    public final long d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final fa4 j;

    public ga4(long j, int i, long j2, float f, float f2, float f3, float f4, fa4 fa4Var) {
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = fa4Var;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(":");
        long j = this.d;
        sb.append(j != 0 ? qu6.n(j, "g") : Integer.valueOf(this.e));
        return sb.toString();
    }
}
