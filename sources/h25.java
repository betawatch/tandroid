// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class h25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ h25(icc iccVar, Exception exc, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(null, exc.getMessage() != null ? exc.getMessage() : "NULL_ERROR");
                break;
            case 1:
                iccVar.a(null, exc.getMessage() != null ? exc.getMessage() : "NULL_ERROR");
                break;
            case 2:
                iccVar.a(null, exc.getMessage());
                break;
            default:
                iccVar.a(null, exc.getMessage());
                break;
        }
    }
}
