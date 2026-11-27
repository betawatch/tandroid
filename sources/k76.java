// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
