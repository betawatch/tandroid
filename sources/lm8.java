// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lm8 extends gna {
    public final /* synthetic */ byte a;
    public final long b;
    public final long c;

    public lm8(long j, long j2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, yw7 yw7Var) {
        long A = yw7Var.A();
        if ((128 & A) != 0) {
            return ((((A & 1) << 32) | yw7Var.C()) + j) & 8589934591L;
        }
        return -9223372036854775807L;
    }

    @Override // gna
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return kt6.q(sb, this.c, " }");
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return kt6.q(sb2, this.c, " }");
        }
    }
}
