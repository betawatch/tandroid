package o4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a0(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.v();
                break;
            case 1:
                e0 e0Var = this.b;
                if (!e0Var.Y) {
                    s sVar = e0Var.D;
                    sVar.getClass();
                    sVar.s(e0Var);
                    break;
                }
                break;
            default:
                this.b.S = true;
                break;
        }
    }
}
