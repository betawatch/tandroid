// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class oqc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqc b;

    public /* synthetic */ oqc(pqc pqcVar, byte b) {
        this.a = b;
        this.b = pqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pqc pqcVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new oqc(pqcVar, (byte) 1));
                break;
            default:
                pqcVar.a();
                break;
        }
    }
}
