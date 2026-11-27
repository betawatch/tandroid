// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nca b;

    public /* synthetic */ mca(nca ncaVar, byte b) {
        this.a = b;
        this.b = ncaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nca ncaVar = this.b;
        switch (b) {
            case 0:
                if (ncaVar.x) {
                    ncaVar.d();
                    break;
                }
                break;
            default:
                ncaVar.invalidateSelf();
                break;
        }
    }
}
