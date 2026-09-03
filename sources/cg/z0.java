package cg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ z0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.c = null;
                o5.i iVar = d1Var.a;
                if (iVar != null) {
                    iVar.q();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
