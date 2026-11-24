// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mz3 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ byte g;
    public final /* synthetic */ gk7 h;
    public boolean d = false;
    public long f = -1;

    public mz3(gk7 gk7Var, int i, long j, long j2, byte b) {
        this.g = b;
        this.h = gk7Var;
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final void a() {
        boolean z;
        byte b = this.g;
        gk7 gk7Var = this.h;
        switch (b) {
            case 0:
                t14 t14Var = (t14) gk7Var;
                if (t14Var.u1 == null || t14Var.getVisibility() != 0 || !t14Var.L0) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
                break;
            default:
                z = ((kz6) gk7Var).N();
                break;
        }
        this.d = z;
        if (z) {
            return;
        }
        if (this.e) {
            na7.q1(this.a).G4(2, 0, this.b, this.c, null);
        }
        this.f = -1L;
    }

    public final void b() {
        if (this.d) {
            if (this.f == -1) {
                this.f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f > 2000) {
                this.e = true;
                this.f = System.currentTimeMillis();
                na7.q1(this.a).G4(10, 0, this.b, this.c, null);
            }
        }
    }
}
