// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class iz0 {
    public final /* synthetic */ byte a = 1;
    public int b;
    public long c;
    public int d;

    public iz0(long j, int i, int i2) {
        this.c = j;
        this.b = i;
        this.d = i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("part{");
                sb.append(this.c);
                sb.append(", ch=");
                sb.append(this.b);
                sb.append(", q=");
                return de9.l(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ iz0() {
    }
}
