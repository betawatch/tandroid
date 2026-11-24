// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kj6 {
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
        tf7 tf7Var = (tf7) this.d;
        long j2 = j * tf7Var.g;
        if (this.b != -1 && (i = this.c) != -1) {
            j2 -= r5 + i;
        }
        if (j2 > 0) {
            return g8c.Z(tf7Var.d, j2 - 1);
        }
        return -9223372036854775807L;
    }
}
