package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 {
    public int a;
    public String b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public String h;
    public String i;
    public byte j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.b) != null && (str2 = this.h) != null && (str3 = this.i) != null) {
            return new r0(this.a, str, this.c, this.d, this.e, this.f, this.g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.b == null) {
            sb2.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
