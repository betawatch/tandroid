// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class iba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tba b;

    public /* synthetic */ iba(tba tbaVar, byte b) {
        this.a = b;
        this.b = tbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tba tbaVar = this.b;
        switch (b) {
            case 0:
                tbaVar.b0();
                break;
            case 1:
                m01.u(tbaVar.getParentActivity(), ob6.M0(2131752119, null));
                break;
            default:
                tbaVar.c.g3.O(true);
                break;
        }
    }
}
