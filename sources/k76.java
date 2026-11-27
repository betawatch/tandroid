// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class k76 extends y1 {
    public final j76 a = new j76();
    public final int b;
    public boolean c;

    public k76(int i) {
        this.b = i;
    }

    @Override // y1
    public final boolean b(hk0 hk0Var) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // y1
    public final hk0 e() {
        return this.a;
    }

    @Override // y1
    public final boolean f() {
        return true;
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        if (mp3Var.h) {
            if (((yi6) this.a.c) == null) {
                return null;
            }
            hk0 e = mp3Var.h().e();
            this.c = (e instanceof ay7) || (e instanceof j76);
            return qk2.a(mp3Var.e);
        }
        int i = mp3Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new qk2(-1, mp3Var.c + i2, false);
        }
        return null;
    }
}
