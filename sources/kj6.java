// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
