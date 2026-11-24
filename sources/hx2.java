// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hx2 {
    public final gx2 a;
    public long b;
    public boolean c;
    public final mk2 d = new mk2(this, (byte) 11);

    public hx2(gx2 gx2Var) {
        this.a = gx2Var;
    }

    public final void a(long j) {
        if (this.c && this.b == j) {
            return;
        }
        this.b = j;
        if (j <= 0) {
            b();
            return;
        }
        this.c = true;
        mk2 mk2Var = this.d;
        gl.r(mk2Var);
        gl.d3(mk2Var, 1000L);
    }

    public final void b() {
        this.c = false;
        gl.r(this.d);
    }
}
