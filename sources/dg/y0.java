package dg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ y0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                c1Var.c = null;
                o5.i iVar = c1Var.a;
                if (iVar != null) {
                    iVar.c();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
