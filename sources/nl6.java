// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nl6 {
    public long a;
    public int b;
    public int c;
    public Object d;

    public final long a() {
        int i;
        long j = this.a;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        wh7 wh7Var = (wh7) this.d;
        long j2 = j * wh7Var.g;
        if (this.b != -1 && (i = this.c) != -1) {
            j2 -= r5 + i;
        }
        if (j2 > 0) {
            return hac.Z(wh7Var.d, j2 - 1);
        }
        return -9223372036854775807L;
    }
}
