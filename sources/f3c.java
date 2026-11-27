// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;
    public final /* synthetic */ String c;

    public /* synthetic */ f3c(icc iccVar, String str, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(str, Boolean.FALSE);
                break;
            case 1:
                iccVar.a(null, str);
                break;
            case 2:
                iccVar.a(null, str);
                break;
            default:
                iccVar.a(null, str);
                break;
        }
    }
}
