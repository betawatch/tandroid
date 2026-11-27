// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class au7 implements vw8 {
    public static final hz6 c = new hz6((byte) 24);
    public static final vq2 d = new vq2(6);
    public qd3 a;
    public volatile vw8 b;

    public au7(hz6 hz6Var, vw8 vw8Var) {
        this.a = hz6Var;
        this.b = vw8Var;
    }

    public final void a(qd3 qd3Var) {
        vw8 vw8Var;
        vw8 vw8Var2;
        vw8 vw8Var3 = this.b;
        vq2 vq2Var = d;
        if (vw8Var3 != vq2Var) {
            qd3Var.f(vw8Var3);
            return;
        }
        synchronized (this) {
            vw8Var = this.b;
            if (vw8Var != vq2Var) {
                vw8Var2 = vw8Var;
            } else {
                this.a = new rm6(this.a, qd3Var, (byte) 11);
                vw8Var2 = null;
            }
        }
        if (vw8Var2 != null) {
            qd3Var.f(vw8Var);
        }
    }

    @Override // vw8
    public final Object get() {
        return this.b.get();
    }
}
