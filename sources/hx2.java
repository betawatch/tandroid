// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        gl.e3(mk2Var, 1000L);
    }

    public final void b() {
        this.c = false;
        gl.r(this.d);
    }
}
