// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class by2 {
    public final ay2 a;
    public long b;
    public boolean c;
    public final vd2 d = new vd2(this, (byte) 17);

    public by2(ay2 ay2Var) {
        this.a = ay2Var;
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
        vd2 vd2Var = this.d;
        hl.r(vd2Var);
        hl.d3(vd2Var, 1000L);
    }

    public final void b() {
        this.c = false;
        hl.r(this.d);
    }
}
