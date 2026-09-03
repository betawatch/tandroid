package dg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ g0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m mVar = m0Var.A;
                if (mVar != null) {
                    m0Var.a.g(mVar);
                    m0Var.A = null;
                    break;
                }
                break;
            default:
                this.b.a(null, true, null);
                break;
        }
    }
}
